package L5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class L1 {
	public static void main(String[] args) {
		// 오름차순
		int[] arr = { 12, 43, 5, 4, 100, 88 };

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// 내림차순
		Integer[] arr2 = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		Arrays.sort(arr2, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr2));

		myCompareClass mcc = new myCompareClass();
		Arrays.sort(arr2, mcc);
		System.out.println(Arrays.toString(arr2));

		Comparator<Integer> myCompare = new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return a - b;
			}
		};
		Arrays.sort(arr2, myCompare);
		System.out.println(Arrays.toString(arr2));

		Arrays.sort(arr2, new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return b - a;
			}
		});
		System.out.println(Arrays.toString(arr2));
		
		Arrays.sort(arr2, (a,b)->{
			return b-a;
		});
		System.out.println(Arrays.toString(arr2));
	}
}

class myCompareClass implements Comparator<Integer> {
	public int compare(Integer a, Integer b) {
		return b - a;
	}
}
