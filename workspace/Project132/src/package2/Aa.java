package package2;

import java.util.Arrays;

public class Aa {
	public static void main(String[] args) {
		String string = "try hello world";
		String[] s1 = string.split(" ");
		System.out.println(Arrays.toString(s1));
		int[] sLen = new int[s1.length];
		for (int i = 0; i < s1.length; i++) {
			sLen[i] = s1[i].length();
		}
//	String[] word = s1[0].split("");
//	System.out.println(word[]);
		String[] s2 = new String[s1.length];
		String result = "";
//		for (int i = 0; i < s1.length; i++) {
		String[] word = s1.split("");
		for (int j = 0; j < sLen[i]; j++) {
			if (j == 0) {
				result = result + word[j].toUpperCase();
			} else if (j % 2 == 0) {
				result = result + word[j].toUpperCase();
			} else {
				result = result + word[j].toLowerCase();
			}
		}
//		}

		System.out.println(s2[0]);

	}
}

//for (int i = 0; i < s1.length; i++) {
//	String[] word = s1[i].split("");
//	for (int j = 0; j < sLen[i]; j++) {
//		if (j == 0) {
//			s2[i] = s2[i] + word[j].toUpperCase();
//		} else if (j % 2 == 0) {
//			s2[i] = s2[i] + word[j].toUpperCase();
//		} else {
//			s2[i] = s2[i] + word[j].toLowerCase();
//		}
//	}
//}
