import java.util.Random;

public class L4Quiz1 {
	public static void main(String[] args) {
		Random random = new Random();

		int randomNum = random.nextInt();
		int arr[] = new int[20];
		int tmp = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(30);
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - (i + 1); j++) {
				if (arr[j] < arr[j + 1]) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
