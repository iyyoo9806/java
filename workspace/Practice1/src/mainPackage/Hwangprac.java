package mainPackage;

public class Hwangprac {
	public static void main(String[] args) {

		int sum = 0;
//	for (int i = 0; i<= 100; i+3) {
//		sum = sum + i;
//		print(sum);
//	}
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}

		System.out.println("1부터 100까지의 3의 배수의 합은" + "=" + sum);
	}
}
