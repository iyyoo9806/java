import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz6 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/inputBracket.txt"));
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int N2 = sc.nextInt();
			String str = sc.nextLine();
			String str2 = str.replaceAll(" ", "");
			String[] arr = str2.split("");
			int a = 0;
			int b = 0;
			int answer = 0;
			String T = "";
			String H = "";
			System.out.println(Arrays.toString(arr));
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].equals(")")) {
					a++;
				}
				if (arr[j].equals("(")) {
					b++;
				}
			}
			if (a != b) {
				answer = 0;
			} else if (arr[0].equals(")")) {
				answer = 0;
			} else {
				for (int j = 0; j < arr.length; j++) {
					T = T + arr[j];
				}
				H = T.replace("()", "");
				if (H.equals("")) {
					answer = N2 + 1;
				} else {
					int q = 0;
					int p = 0;
					for (int j = N2 - 1; j < arr.length; j++) {
						if (arr[j].equals(")")) {
							q++;
						} else if (arr[j].equals("(")) {
							p++;
						}
						if (arr[j].equals(")") && q == p) {
							answer = j + 1;
							break;
						}
					}
				}
			}
			System.out.println(answer);
		}
	}
}
