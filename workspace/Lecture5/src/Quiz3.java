
public class Quiz3 {

	public static int[] solution(int[] num_list) {
		int[] answer = {0,0};
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 0) {
				answer[0] = count1= count1+1;
			} else {
				answer[1] = count2= count2+1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int[] plw = new int[2];
		plw = solution(arr);
		System.out.println(plw[0] + " || " + plw[1]);
	}
}
