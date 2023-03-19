import java.util.Scanner;

public class P20 {
	public static void main(String[] args) {
		System.out.println("국어 점수를 입력해 주세요.");

		Scanner s = new Scanner(System.in);

		int number = s.nextInt();

		if (number < 0 || number > 100) {
			System.out.println("0~100의 값을 입력해주세요.");
			return;
		}
		
		if (number >= 90) {
			System.out.println("Grade A");
		} else if (number < 90 && number >= 80) {
			System.out.println("Grade B");
		} else if (number < 80 && number >= 70) {
			System.out.println("Grade C");
		} else if (number < 70 && number >= 60) {
			System.out.println("Grade D");
		} else {
			System.out.println("Grade F");
		}

	}
}
