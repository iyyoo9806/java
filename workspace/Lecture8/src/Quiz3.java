import java.util.Arrays;
import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		int[][] square = new int[101][101];
		int answer = 0;

		for (int i = 0; i < inputNum; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();

			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					square[j][k] = 1;
				}
			}
		}
		int totalSum = 0;
		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square[0].length; j++) {
				if (i - 1 >= 0 && square[i][j] == 1 && square[i - 1][j] == 0) {
					totalSum++;
				}
				if (i + 1 < 101 && square[i][j] == 1 && square[i + 1][j] == 0) {
					totalSum++;
				}
				if (j - 1 >= 0 && square[i][j] == 1 && square[i][j - 1] == 0) {
					totalSum++;
				}
				if (j + 1 < 101 && square[i][j] == 1 && square[i][j + 1] == 0) {
					totalSum++;
				}
			}
		}
		System.out.println(totalSum);
	}
}
