import java.util.Scanner;

public class ThirdJw {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		for (int i = 1; i < 99999; i++) {

			System.out.println("숫자를 입력하세요");

			String inputString = s.nextLine();
			
			int inputNumber = Integer.parseInt(inputString);
			
			System.out.println(7 * (inputNumber));

			break;

		}
	}
}
