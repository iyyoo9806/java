import java.util.Random;

public class A2 {
	public static void main(String[] args) {
		int[][] numbers = new int[4][4];

		Random random = new Random();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				numbers[i][j] = random.nextInt(100);
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				numbers[i][3] = numbers[i][3] + numbers[i][j];
				numbers[3][j] = numbers[3][j] + numbers[i][j];
				numbers[3][3] = numbers[3][3] + numbers[i][j];
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.printf("%4d", numbers[i][j]);
			}
			System.out.println();
		}
	}
}
