package com.iyi;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Info info = new Info();

		for (int i = 0; i < 99999; i++) {
			System.out.println("원하시는 메뉴를 선택하세요.");
			System.out.println("1. 학생정보 입력");
			System.out.println("2. 성적순 출력");
			System.out.println("q. 종료");
			String inputString = scanner.nextLine();
			if (inputString.equals("q")) {
				System.out.println("종료");
				break;
			} else if (inputString.equals("1")) {
				try {
					info.addInfo();
				} catch (NumberFormatException e) {
					System.out.println("점수에는 숫자만 입력할 수 있습니다.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (inputString.equals("2")) {
				info.rank();
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}
