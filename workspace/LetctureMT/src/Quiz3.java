import java.util.Arrays;

public class Quiz3 {
	public static void main(String[] args) {
		int y = 2;
		int x = 3;
//	int[][] arr = new int[y][x];
		int[][] arr = { { 2, 4, 8 }, { 10, 12, 14 } };
		
		int N = 3;
		
		int y1 = 1;
		int x1 = 1;
		int a1 = 0;
		int b1 = 0;
		
		int y2 = 1;
		int x2 = 2;
		int a2 = 0;
		int b2 = 0;
		
		int y3 = 2;
		int x3 = 2;
		int a3 = 0;
		int b3 = 0;
		
		for(int i=0; i<x; i++) {
			a1 = a1 + arr[y1-1][i];
		}
		for(int i=0; i<y; i++) {
			b1 = b1 + arr[i][x1-1];
		}
		System.out.println(a1+","+b1);
		
		for(int i=0; i<x; i++) {
			a2 = a2 + arr[y2-1][i];
		}
		for(int i=0; i<y; i++) {
			b2 = b2 + arr[i][x2-1];
		}
		System.out.println(a2+","+b2);
		
		for(int i=0; i<x; i++) {
			a3 = a3 + arr[y3-1][i];
		}
		for(int i=0; i<y; i++) {
			b3 = b3 + arr[i][x3-1];
		}
		System.out.println(a3+","+b3);
	}
}
