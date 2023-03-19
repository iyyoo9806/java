import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		int a = p.nextInt();

		if (a > 100) {
			System.out.println("100 이상의 점수는 넣을 수 없습니다.");
		} else if (a >= 90) {
			System.out.println("A");
			
		} else if (a >= 80) {
			System.out.println("B");

		} else if (a >= 70) {
			System.out.println("C");
			
		} else if (a >= 60) {
			System.out.println("D");
			
		} else {
			System.out.println("F");
		}

	}
}
