package answer2;

import java.util.Scanner;

public class Student {
	String name = "";
	String address = "";
	String sex = "";
	Test[] test = new Test[2];
	boolean flag = false;

	public void infoTest() {
		if(flag) {
		test[0].printScore();
		test[1].printScore();
		}else {
			System.out.println("입력되지 않았습니다.");
		}
		}
	public int mdTest() {
		if(flag) {
		int sum = test[0].korScore + test[0].engScore + test[0].mathScore;
		int avg = sum/3;
		return avg;
		}else {
			return 0;
		}
	}
	public int FnTest() {
		if(flag) {
		int sum = test[1].korScore + test[1].engScore + test[1].mathScore;
		int avg = sum/3;
		return avg;
		}
		else {
			return 0;
		}
	}
	
	public void inputStudent() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해 주세요");
		this.name = scanner.nextLine();
		System.out.println("주소를 입력해 주세요");
		this.address = scanner.nextLine();
		System.out.println("성별을 입력해 주세요");
		this.sex = scanner.nextLine();
		for(int i=0; i<test.length; i++) {
			test[i] = new Test();
			if(i==0) {
				System.out.println("중간고사");
				test[i].Score();
			}else {
				System.out.println("기말고사");
				test[i].Score();
			}
		}
		flag = true;
	}
}
