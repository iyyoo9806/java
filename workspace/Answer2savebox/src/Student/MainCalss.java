package Student;

import java.util.Scanner;

public class MainCalss {
	public static void main(String[] args) {
		Student[] student = new Student[30];
		
		// 데이터 입력
		for (int i = 0; i < student.length; i++) {
			// 객체 생성
			student[i] = new Student();
			// 데이터 입력
			Scanner scanner = new Scanner(System.in);
			String inputText = "";
			System.out.println("이름을 입력해주세요.");
			inputText = scanner.nextLine();
//			student[i].name = inputText;
			student[i].setName(inputText);
			System.out.println("국어 점수를 입력해주세요.");
			inputText = scanner.nextLine();
//			student[i].kor = Integer.parseInt(inputText);
			student[i].setKor(Integer.parseInt(inputText));
			System.out.println("수학 점수를 입력해주세요.");
			inputText = scanner.nextLine();
//			student[i].math = Integer.parseInt(inputText);
			student[i].setMath(Integer.parseInt(inputText));
			System.out.println("영어 점수를 입력해주세요.");
			inputText = scanner.nextLine();
//			student[i].eng = Integer.parseInt(inputText);
			student[i].setEng(Integer.parseInt(inputText));
		}
		
		// 계산
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		for (int i = 0; i < student.length; i++) {
//			korTotal = korTotal + student[i].kor;
			korTotal = korTotal + student[i].getKor();
//			engTotal = engTotal + student[i].eng;
			engTotal = engTotal + student[i].getEng();
//			mathTotal = mathTotal + student[i].math;
			mathTotal = mathTotal + student[i].getMath();
		}
		
		// 출력
		System.out.println("국어 점수 총점 : " + korTotal + ", 평균 : " + (korTotal / (double)student.length));
		System.out.println("영어 점수 총점 : " + engTotal + ", 평균 : " + (engTotal / (double)student.length));
		System.out.println("수학 점수 총점 : " + mathTotal + ", 평균 : " + (mathTotal / (double)student.length));
	}
}
