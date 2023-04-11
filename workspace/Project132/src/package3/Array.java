package package3;

import java.util.Scanner;

public class Array {
	int num = 0;
	public void ArrCreateNum() {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		int inputNum = Integer.parseInt(inputString);
		this.num = inputNum;
	}
}
