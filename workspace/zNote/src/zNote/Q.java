package zNote;

import java.util.Arrays;
import java.util.Scanner;

public class Q {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int a = scanner.nextInt();
		int[] b = new int[a];
		for(int i=0; i<a; i++) {
			b[i] = scanner.nextInt();
		}
		Arrays.sort(b);
		for(int i=0; i<a; i++) {
			System.out.println(b[i]);
		}
	}
}
