import java.util.Arrays;

public class Practice {
public static void main(String[] args) {
	String arr = "((())((()))(()))";
	int n = 5;
	int answer = 0;
	String[] arr2 = arr.split("");
	for(int i=0; i<arr2.length; i++) {
		if(arr2[i].equals("(")&&arr2[i+1].equals(")")) {
			arr2[i] = "!";
			arr2[i+1] = "!";
		}
		
	}
	System.out.println(Arrays.toString(arr2));
	for(int i=0; i<arr2.length-1; i++) {
		for(int j=i; j<arr2.length; j++) {
			if((j-n-1)%2==0&&arr2[j].equals(")")) {
				answer = j;
			}
		}
	}
	System.out.println(answer);
}
}
