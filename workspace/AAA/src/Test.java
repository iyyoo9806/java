import java.util.Scanner;

public class Test {

	String category;
	int korScore;
	int engScore;
	int mathScore;
	int sum =0;
	public void inputScore() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요");
		this.korScore = scanner.nextInt();
		System.out.println("영어점수를 입력하세요");
		this.engScore = scanner.nextInt();
		System.out.println("수학점수를 입력하세요");
		this.mathScore = scanner.nextInt();
		this.sum =this.korScore+this.engScore+this.mathScore;
	}	
}