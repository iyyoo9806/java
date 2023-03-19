import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner s2 = new Scanner(System.in);
		
		System.out.println("첫 숫자");
		int a = s2.nextInt();
		
		System.out.println("두번 째 숫자");
		int b = s2.nextInt();
			
		int sumNumber = a + b;
		System.out.println("두 숫자의 합은" + sumNumber + "입니다.");
	}
}
