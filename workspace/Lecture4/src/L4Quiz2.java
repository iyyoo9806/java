import java.util.Arrays;

public class L4Quiz2 {
	
	public static void main(String[] args) {
		int[][] res = new int[8][9];

		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				res[i][j] = (i + 2) * (j + 1);
				System.out.print(res[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
