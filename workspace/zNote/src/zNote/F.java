package zNote;

public class F {
	public static String solution(String s) {
		String answer = "";
		String[] string = s.split("");

		int sequence = 0;
		
		for (int i = 0; i < string.length; i++) {
			if (string[i].equals(" ")) {
				sequence = 0;
			} else if (sequence % 2 == 0) {
				string[i] = string[i].toUpperCase();
				sequence = sequence + 1;
			} else if (sequence % 2 != 0) {
				string[i] = string[i].toLowerCase();
				sequence = sequence + 1;
			}
			answer = answer + string[i];
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("try hello world"));
	}
}
