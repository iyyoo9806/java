import java.util.Arrays;
import java.util.Scanner;

public class P16 {
public static void main(String[] args) {
	//학생 10명의 성적을 입력
//	int s1 = scanner.nextInt();
//	int s2 = scanner.nextInt();
//	int s3 = scanner.nextInt();
//	int s4 = scanner.nextInt();
//	int s5 = scanner.nextInt();
//	int s6 = scanner.nextInt();
//	int s7 = scanner.nextInt();
//	int total = s1+s2+s3~~~~
	
	int[] score = new int[10]; // 선언을 한번에 할 수 있다.
//	score[0] = scanner.nextInt();
//	score[1] = scanner.nextInt();
//	score[2] = scanner.nextInt();
	Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<10; i++) {
		System.out.println((i+1)+"번째 학생의 점수를 입력해 주세요");
		score[i] = scanner.nextInt();
		}
		System.out.println(("입력된 점수 확인"));
		System.out.println(Arrays.toString(score));
		System.out.println("2번째 학생 점수 : "+score[1]);
		int totalScore = 0;
		for(int i=0; i<10; i++) {
			totalScore = totalScore + score[i];
		}
		System.out.println("총점 : " + totalScore);
		System.out.println("평균" + totalScore/(double)10);
	}
}

