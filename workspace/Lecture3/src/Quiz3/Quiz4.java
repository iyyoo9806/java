package Quiz3;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int S = scanner.nextInt();
		
		if(11<T && T<17 && S==0) {
			System.out.println(320);
		}else {
			System.out.println(280);
		}
		
	}
}
