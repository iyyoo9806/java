import java.util.Scanner;

public class FQuestions {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("5개의 숫자를 입력하세요");
	int n =s.nextInt();
	int a[] = new int[n];
	
	for(int k=0; k<n; k++) {
		int inputInt = s.nextInt();
		a[k] = inputInt;
	}
	for(int k=0; k<n; k++) {
		System.out.println(a[k]);
	}
	
	
	int min = Integer.MAX_VALUE ,max = Integer.MIN_VALUE;
	for(int i = 0; i<a.length; i++) {
		if(a[i] < min) min = a[i];
		if(a[i] > max) max = a[i];
		
	}System.out.println(min +","+ max);

	
	
}
}
