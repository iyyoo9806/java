package L6;

import java.util.Arrays;

import java.util.Arrays;

public class Solution {
	// 최대공약수 구하기
	public static int fx(int n, int m) {
		if (m == 0) {
			return n;
		} else {
			return fx(m, n % m);
		}
	}
	//최소공배수는 두 수 곱한거 나누기 최대공약수
	public static int[] solution(int n, int m) {
		int[] answer = new int[2];
		answer[0] = fx(m, n % m);
		answer[1] = n * m / fx(m, n % m);
		return answer;
	}

}

