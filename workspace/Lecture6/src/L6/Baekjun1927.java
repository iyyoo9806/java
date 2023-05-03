package L6;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Baekjun1927 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (num[i] == 0) {
				if (minHeap.isEmpty()) {
					System.out.println(0);
				} else
					System.out.println(minHeap.poll());
			} else {
				minHeap.offer(num[i]);
			}
		}
	}
}
