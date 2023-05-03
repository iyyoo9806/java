package zNote;

//import java.util.Arrays;

public class A {
	public static int solution(String my_string, String target) {
        int answer = 0;
        if(my_string.contains(target)) {
        	answer = 1;
        }else {
        	answer=0;
        }
        
        return answer;
    }
	public static void main(String[] args) {
		String my_String = "banana";
		String target = "an";
		System.out.println(solution(my_String,target));
		System.out.println(my_String.length());
		int a = 2;
		int b = 4;
		int c = Math.abs(a-b);
				System.out.println(Math.abs(a));
	}
}