package answer2;

import java.util.Scanner;

//1학년 내 클래스
public class ClassRoom {
	String name;// A반B반C반....
	Student[] student = new Student[2];
	boolean flag = false;
	
	public void inputRoom(String s) {
		this.name = s;
		for (int i = 0; i < student.length; i++) {
			student[i] = new Student();
			student[i].inputStudent();
		}
		flag = true;
	}

	public void infoRoom() {
		if(flag) {
		for (int i = 0; i < student.length; i++) {
			student[i].infoTest();
		}
		}else {
			System.out.println("입력되지 않았습니다.");
		}
	}

	public void mdStat() {
		int a = 0;
		if(flag) {
		for (int i = 0; i < student.length; i++) {
			a = a + student[i].mdTest();
		}
		System.out.println(this.name + "의 중간고사 점수 평균은" + (a / student.length));
	}else {
		System.out.println("입력되지 않았습니다.");
	}
	}
	public void LsStat() {
		int a = 0;
		if(flag) {
		for (int i = 0; i < student.length; i++) {
			a = a + student[i].FnTest();
		}
		System.out.println(this.name + "의 기말고사 점수 평균은" + (a / student.length));
	}else {
		System.out.println("입력되지 않았습니다.");
	}
	}
}
