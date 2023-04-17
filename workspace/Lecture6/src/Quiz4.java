
public class Quiz4 {
	class Solution {
		public int[] solution(int[] array, int n) {
			int[] answer = new int[array.length];
			for (int i = 0; i < answer.length; i++) {
				answer[i] = array[i] * n;
			}

			return answer;
		}
	}
}
