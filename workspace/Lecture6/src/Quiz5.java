
public class Quiz5 {
	public static String solution(int n) {
		String answer = "";
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				answer = answer + "코";
			} else if (i % 2 == 0) {
				answer = answer + "포";
			}
		}

		return answer;
	}
}
