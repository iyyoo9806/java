import java.util.Arrays;
import java.util.Random;

public class A1 {
	public static void doSort() {

		int[] numbers = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		// random 세팅
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100) + 1;
			//numbers[i] = (int)Math.floor(Math.random() * 100) +1;
		}
		System.out.println(Arrays.toString(numbers));
		
		//sort (selection sort)
		
		for(int i=0; i<numbers.length-1; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				if(numbers[i]>numbers[j]) {
					int tmp  = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));
	}
	
	public void abc() {
		System.out.println("ABC");
	}
}
