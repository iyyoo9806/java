import java.util.Arrays;

public class Forth {
	public static int[] solution(String[] keymap, String[] targets) {
		int[] answer = new int[targets.length];
		int[] length = new int[keymap.length];
		int y = keymap.length;
		for (int i = 0; i < keymap.length; i++) {
			length[i] = keymap[i].length();
		}
		Arrays.sort(length);
		int x = length[keymap.length - 1];

		String[][] arr = new String[y][x];
		for (int i = 0; i < y; i++) {
			String[] str = keymap[i].split("");
			for (int j = 0; j < x; j++) {
				if (j >= str.length) {
					arr[i][j] = "0";
				} else {
					arr[i][j] = str[j];
				}
			}
		}

		for (int i = 0; i < targets.length; i++) {
			String[] arr2 = targets[i].split("");
			int t = 0;
			for (int j = 0; j < arr2.length; j++) {
				int q = Integer.MAX_VALUE;
				for (int z = 0; z < y; z++) {
					// 여기서 키맵이 나뉨
					for (int v = 0; v < x; v++) {
						// 여기서 이제 arr2[j]랑 같은 arr[z][v] v의인덱스 +1
						if (arr2[j].equals(arr[z][v])) {
							if (v < q) {
								q = v;
							}
						}
					}
				}
				if (q == Integer.MAX_VALUE) {
					t = -1;
					break;
				} else {
					t = t + q + 1;
				}
			}
			answer[i] = t;
		}
		return answer;

	}

	public static void main(String[] args) {
		String[] keymap = { "A" };
		String[] targets = { "A", "B" };
		System.out.println(Arrays.toString(solution(keymap, targets)));
	}
}
