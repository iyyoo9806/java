import java.util.Arrays;

public class Quiz5 {
	public static void main(String[] args) {
		int N = 5;
		int[] arr = {5,9,7,11,15};
		int length = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%N==0) {
				length++;
			}
		}
		int[] answer = new int[length];
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%N==0) {
				answer[count] = arr[i];
				count++;
			}
		}
		System.out.println(Arrays.toString(answer));
	}
}
