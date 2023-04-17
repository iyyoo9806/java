import java.util.Arrays;

public class Quiz3 {
	public int solution(int[] array, int n) {
		int answer = 0;
		Arrays.sort(array);
		int len = array[array.length - 1];
		int[] cnt = new int[len + 1];
		for (int i = 0; i < array.length; i++) {
			cnt[array[i]]++;
		}
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] > 0 && i != n) {
				answer++;
			}
		}
		return answer;
	}
}
