import java.util.Arrays;

public class SecondQuiz {
public static void main(String[] args) {
	int a[] = {1,2,3,4,5};
	String str = Arrays.toString(a);
	// str = "[1, 2, 3, 4, 5]"
	// str = "12345"
	
	str = str.replace(" ","");
	str = str.replace("]","");
	str = str.replace("[","");
	
	String A[] = str.split(",");
	
	for(int i= 0; i<a.length; i++) {
		System.out.println(A[i]);
}
}
}