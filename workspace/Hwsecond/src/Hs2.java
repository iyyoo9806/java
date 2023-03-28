import java.util.Scanner;

public class Hs2 {
public static void main(String[] args) {
		 int[][] arr = new int[4][4];
		 Scanner scanner = new Scanner(System.in);
		 
		 for(int i=0; i<arr.length-1; i++) {
			 for(int j=0; j<arr[i].length-1; j++) {
				System.out.println(i+","+j+"번째 값을 입력해 주세요");
				arr[i][j] = scanner.nextInt();
				
			 }
		}
		 
	 	for(int i=0; i<arr.length-1; i++) {
	 		for(int j=0; j<arr[i].length-1; j++) {
				System.out.print(arr[i][j]+" ");
				arr[i][arr.length-1] = arr[i][arr.length-1]+arr[i][j];
			}
			 	System.out.print(arr[i][arr.length-1]);
			 	System.out.println(" ");
	 	}
	 	
	 	for(int i=0; i<arr.length-1; i++) {
			 for(int j=0; j<arr[i].length-1; j++) {
				 arr[arr.length-1][i] = arr[arr.length-1][i]+arr[j][i];
			 }
			 System.out.print(arr[arr.length-1][i]+" ");
	 	}	
	 	
	}
}