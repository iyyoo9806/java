package Quiz2;

import java.util.Random;

public class Quiz2 {
	public static void main(String[] args) {
		Random random = new Random();
		int randomNum = random.nextInt();
		int[] arr = new int[6];
		// 로또 번호 생성과 중복값 변경
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}

//		 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}