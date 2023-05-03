package L6;

public class CaesarCipher {
	public static String solution(String s, int n) {
		String answer = "";
		char[] s2 = new char[s.length()];// String s의 단어 하나하나 따로 담을 배열
		int[] num = new int[s.length()];// s2배열에 담긴 단어 하나하나를 아스키코드로 변환해 담을 배열
		for (int i = 0; i < s2.length; i++) {
			s2[i] = s.charAt(i);// 단어 하나하나 담기
			num[i] = (int) s2[i];// 아스키코드 변환해 담기
		}
		// 아스키코드로 문자 밀어주는 로직
		for (int i = 0; i < s2.length; i++) {
			// 아스키코드 32는 빈 공백, 즉 " "를 의미 위에서 변환된 아스키코드가 32라면 변화하지 않게 하는 조건문
			if (num[i] == 32) {
				num[i] = 32;
				// 대문자 A-Z 의 범위에서 만약 밀어주는 범위가 마지막 단어인 Z를 넘어가는 경우 -26을 해 65부터 시작하게 만드는 로직
			} else if (num[i] + n > 90 && num[i] > 64 && num[i] < 91) {
				num[i] = num[i] + n - 26;
				// 소문자 버전
			} else if (num[i] + n > 122 && num[i] > 96 && num[i] < 123) {
				num[i] = num[i] + n - 26;
				// 문자를 밀어주는 범위가 마지막인 Z를 넘지 않는 경우
			} else {
				num[i] = num[i] + n;
			}
		}
		for (int i = 0; i < num.length; i++) {
			// 위 로직을 통해 저장된 최종적인 아스키 코드를 (char)를 통해 문자로 변환시켜주는 작업
			answer = answer + (char) num[i];
		}
		return answer;
	}

}