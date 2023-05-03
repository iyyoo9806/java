import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/inputRabbit.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();// 3번
		for (int i = 0; i < T; i++) {// 3번 반복
//			int[][] space = new int[20][20];// 공간
			int N = sc.nextInt();//토끼 갯수
			int foxX = sc.nextInt();// 여우 x좌표
			int foxY = sc.nextInt();// 여우 y좌표
			int answer = 0;
			for(int j=0; j<N; j++) {
				int RabbitX = sc.nextInt();
				int RabbitY = sc.nextInt();
				
				if(foxX==RabbitX) {
					answer++;
				}else if(foxY==RabbitY) {
					answer++;
				}else if( 1.0 == Math.abs( (foxY - RabbitY )/(foxX - RabbitX))) {
					answer++;
				}
			}
			System.out.println(answer);
		}
	}
}