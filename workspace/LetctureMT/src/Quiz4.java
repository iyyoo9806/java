import java.util.Arrays;

public class Quiz4 {
public static void main(String[] args) {
//	int N = 5;
	int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
	int[] arr2 = {7,5,2,1,2};
	int[] arr3 = {4,5,2};
	int[] arr4 = {2,6,4,8,10};
	int[] arr5 = {1,3,7,5,9};
	
	for(int i=0; i<arr1.length-1; i++) {
		for(int j=0; j<arr1.length-(i+1); j++) {
			if(arr1[j]>arr1[j+1]) {
				int tmp = arr1[j];
				arr1[j] = arr1[j+1];
				arr1[j+1] = tmp;
			}
		}
	}
	
	for(int i=0; i<arr2.length-1; i++) {
		for(int j=0; j<arr2.length-(i+1); j++) {
			if(arr2[j]>arr2[j+1]) {
				int tmp = arr2[j];
				arr2[j] = arr2[j+1];
				arr2[j+1] = tmp;
			}
		}
	}
	
	for(int i=0; i<arr3.length-1; i++) {
		for(int j=0; j<arr3.length-(i+1); j++) {
			if(arr3[j]>arr3[j+1]) {
				int tmp = arr3[j];
				arr3[j] = arr3[j+1];
				arr3[j+1] = tmp;
			}
		}
	}
	
	for(int i=0; i<arr4.length-1; i++) {
		for(int j=0; j<arr4.length-(i+1); j++) {
			if(arr4[j]>arr4[j+1]) {
				int tmp = arr4[j];
				arr4[j] = arr4[j+1];
				arr4[j+1] = tmp;
			}
		}
	}
	
	for(int i=0; i<arr5.length-1; i++) {
		for(int j=0; j<arr5.length-(i+1); j++) {
			if(arr5[j]>arr5[j+1]) {
				int tmp = arr5[j];
				arr5[j] = arr5[j+1];
				arr5[j+1] = tmp;
			}
		}
	}
	
	System.out.println(Arrays.toString(arr1));
	System.out.println(Arrays.toString(arr2));
	System.out.println(Arrays.toString(arr3));
	System.out.println(Arrays.toString(arr4));
	System.out.println(Arrays.toString(arr5));
}
}
