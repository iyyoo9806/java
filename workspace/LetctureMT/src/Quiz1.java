import java.util.Arrays;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = 5;
		int M = 5;
		int K = 2;
		int[] arr = {1,2,3,4,5,6};
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-(i+1); j++) {
				if(arr[j]<arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		int answer = 0;
		for(int i=0; i<=M/K; i++) {
			answer = answer + K*arr[i];
		}
		System.out.println(answer);
	}
}

