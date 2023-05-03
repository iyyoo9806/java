package Movie;

import java.util.Scanner;

public class Genre {
	String name;
	Title[] title = new Title[100];
	int price = 0;
	int index = 0;
	int total = 0;

	Genre(){
		this.name = "장르";
		this.price = 10000;
	}
	
	public void addName() {
		System.out.println("영화 제목을 입력해 주세요.");
		Scanner scanner = new Scanner(System.in);
		String movieName = scanner.nextLine();
		this.title[this.index] = new Title(movieName);
		this.index++;
	}
	
	public void total() {
		for(int i=0; i<this.index; i++) {
			System.out.println(title[i].moiveName);
			System.out.println(this.name);
			System.out.println(this.price);
			total = total + this.price;
		}
	}
}
