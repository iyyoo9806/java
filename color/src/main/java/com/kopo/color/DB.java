package com.kopo.color;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.sqlite.SQLiteConfig;

public class DB {
	Connection connection;
	private void open() {
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			this.connection = DriverManager.getConnection("jdbc:sqlite:/c:\\kopo\\color.db");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void close() {
		if(this.connection != null) {
			try {
				this.connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void createTable( ) {
		this.open();
		String query = "CREATE TABLE history (idx INTEGER PRIMARY KEY AUTOINCREMENT, "
				+ "color TEXT, created TEXT)";
		try {
			Statement statement = this.connection.createStatement();
			statement.execute(query);
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.close();
	}
	
	
	public void insertData(String code) {
		this.open();
		String query = "INSERT INTO history (color, created) VALUES (?, ?)";
		try {
			PreparedStatement preparedStatement = this.connection.prepareStatement(query);
			preparedStatement.setString(1, code);
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String now = formatter.format(date);
			preparedStatement.setString(2, now);
			preparedStatement.execute();
			preparedStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.close();
	}
	
	
	public ArrayList<Color> selectData() {
		ArrayList<Color> result = new ArrayList<Color>();
		this.open();
		String query = "SELECT * FROM history";
		try {
			PreparedStatement statement = this.connection.prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				String code = resultSet.getString("color");
				String created = resultSet.getString("created");
				result.add(new Color(code, created));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		this.close();
		return result;
	}
}
