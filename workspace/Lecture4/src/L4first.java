import java.util.Arrays;

public class L4first {
	public static void main(String[] args) {
		int[][] a= new int[2][2];
		int cnt=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = ++cnt;
			}
		}System.out.println(Arrays.deepToString(a));
		
		
		int b[][];
		
		int c[][] = {{0,0},{0,1},{1,0},{1,1}};
		System.out.println(Arrays.deepToString(c));
	}
	}

