package zNote;

import java.util.Scanner;

public class Q {
	public static void main(String[] args) {
		int checkerBoard[][]  = new int[30][30];
		boolean[][] b = new boolean[3][3];
		
		for(int i=0; i<900; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("게임 시작");
			System.out.println("1p 입력");
			System.out.println("x좌표 : ");
			int firstPlayerX = scanner.nextInt();
			System.out.println("y좌표 : ");
			int firstPlayerY = scanner.nextInt();
			if(b[firstPlayerY][firstPlayerX]==true) {
				System.out.println("이미 입력된 좌표입니다.");
			}else {
				checkerBoard[firstPlayerY][firstPlayerX] = 1;
			}
			System.out.println("2p 입력");
			System.out.println("x좌표 : ");
			int secondPlayerX = scanner.nextInt();
			System.out.println("y좌표 : ");
			int secondPlayerY = scanner.nextInt();
			if(b[secondPlayerY][secondPlayerX]==true) {
				System.out.println("이미 입력된 좌표입니다.");
			}else {
				checkerBoard[secondPlayerY][secondPlayerX] = 2;
			}
			
			
		}
		
	}
}
