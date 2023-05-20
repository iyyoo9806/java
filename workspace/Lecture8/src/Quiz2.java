import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		int[][] square = new int[100][100];
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

		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square[0].length; j++) {
				if (square[i][j] == 1) {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
}
