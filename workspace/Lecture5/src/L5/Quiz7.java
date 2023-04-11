package L5;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz7 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/inputAS.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N = sc.nextInt();
		int[][] arr = new int[T][N];
		for (int i = 0; i < T; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(arr));
		int F = sc.nextInt();
		for (int i = 0; i < F; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int sum = 0;
			for (int j = x - 1; j < x2; j++) {
				for (int k = y - 1; k < y2; k++) {
					sum = sum + arr[j][k];
				}
			}
			System.out.println(sum);
		}
	}
}