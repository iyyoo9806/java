package answer2;

import java.util.Scanner;

public class Test {
	String category;// 중간 기말
	int korScore = 0;
	int engScore = 0;
	int mathScore = 0;

	public void Score() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어점수를 입력해주세요");
		String stringScore1 = scanner.nextLine();
		int score = Integer.parseInt(stringScore1);
		this.korScore = score;
		System.out.println("영어점수를 입력해주세요");
		String stringScore2 = scanner.nextLine();
		int score2 = Integer.parseInt(stringScore2);
		this.engScore = score2;
		System.out.println("수학점수를 입력해주세요");
		String stringScore3 = scanner.nextLine();
		int score3 = Integer.parseInt(stringScore3);
		this.mathScore = score3;
	}

	public void printScore() {
		System.out.println("국어 : " + this.korScore + "영어 : " + this.engScore + "수학 : " + this.mathScore);
	}
}
