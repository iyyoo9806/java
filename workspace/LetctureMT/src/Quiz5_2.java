import java.util.Arrays;

public class Quiz5_2 {
public static void main(String[] args) {
	int[] arr1 = {1,1,2,3,4,6};
	int[] arr2 = {6,1,2,1,4,3};
	
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	String answer = "";
	for(int i=0; i<arr1.length; i++) {
		if(arr1[i]!=arr2[i]) {
			answer = "F";
			break;
		}else {
			answer = "T";
		}
	}
	System.out.println(answer);
}
}
