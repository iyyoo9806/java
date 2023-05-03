import java.util.Arrays;

public class Second {
	public static int[] Tat2(int[] input) {
		int [] answer = new int [2];
		int [] incorrect = new int[1];
		int[][] Square = new int [5][5];
		int a = input[0];
		int b = input[1];
		if(a>5||b>5) {
			incorrect[0] = -1;
			return incorrect;
		}else if(b==4) {
			answer[0] = a;
			answer[1] = b-1;
		}else {
			answer[0] = a;
			answer[1] = b+1;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		int[] input = { 0, 0 };
		System.out.println(Arrays.toString(Tat2(input)));
	}
}
