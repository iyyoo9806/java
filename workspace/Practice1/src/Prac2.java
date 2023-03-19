import java.util.Scanner;

public class Prac2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.println("첫번째 숫자");
		double a = k.nextDouble();

		System.out.println("두번째 숫자");
		double b = k.nextDouble();

		double sumNumber = a + b;

		System.out.println("두 수의 합은" + (sumNumber) + "입니다.");

	}
}
