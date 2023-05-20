package com.iyi;

import java.util.Scanner;

public class Info {
	String name;
	int point;
	Person[] person = new Person[100];
	int index = 0;

	public void addInfo() throws Exception{
//		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("추가할 이름을 입력해 주세요.");
			String name = scanner.nextLine();
			System.out.println("점수를 입력해 주세요.");
			String strPoint = scanner.nextLine();
			int point = Integer.parseInt(strPoint);
			this.person[this.index] = new Person(name, point);
			this.index++;
//		} catch (NumberFormatException e) {
//			// TODO Auto-generated catch block
//			System.out.println("점수에는 숫자를 입력해야합니다.");
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
	}

	public void printInfo() {
		for (int i = 0; i < this.index; i++) {
			System.out.println("이름 : " + this.person[i].name + " 점수 : " + this.person[i].point);
		}
	}

	public void rank() {
		for (int i = 0; i < this.index - 1; i++) {
			for (int j = 0; j < this.index - (i + 1); j++) {
				if (this.person[j].point < this.person[j + 1].point) {
					Person temp = this.person[j];
					this.person[j] = this.person[j + 1];
					this.person[j + 1] = temp;
				}
			}
		}
		this.printInfo();
	}
}
