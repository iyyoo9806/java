import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("첫번째 숫자 입력");
		int a = s.nextInt();

		System.out.println("두번째 숫자 입력");
		int b = s.nextInt();

		int sum = a + b;
		int multi = a * b;

		System.out.println("두 수의 총 합은" + sum + "입니다.");
		System.out.println("두 수의 곱은 " + (a*b) + "입니다.");
	}
}
