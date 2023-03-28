import java.util.Scanner;

public class anotherH2 {
public static void main(String[] args) {
	 String[] arr = new String[9];
	 Scanner scanner = new Scanner(System.in);
	 String inputNum = scanner.nextLine();
//	 int inputInt = Integer.parseInt(inputNum);
	 arr = inputNum.split(" ");
	 int[][] arrayFirst = new int[4][4];
	 int count = 0;
	 // 4X4에서 입력받은 9개의 숫자를 3x3 을 넣는다.
	 for(int i=0; i<4; i++) {
		 for(int j=0; j<4; j++) {
			arrayFirst[i][j] = scanner.nextInt();
			System.out.print(arrayFirst[i][j]);
		 }
	 }	
	 
	 
	 
}
}
