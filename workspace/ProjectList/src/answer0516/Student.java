package answer0516;

import java.util.Scanner;

public class Student {
	String name;
	int score;
	
	Student() {
		this.inputData();
	}
	
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public void inputData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("name : ");
		String tmp = scanner.nextLine();
		this.name = tmp;
		System.out.println("score : ");
		tmp = scanner.nextLine();
		try {
			this.score = Integer.parseInt(tmp);
		} catch (Exception e) {
			System.out.println("score is NaN");
		}
	}
	
	@Override
	public String toString() {
		return this.name + " (" + this.score + ")";
	}
}
