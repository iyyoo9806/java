import java.util.Scanner;

public class P3 {
public static void main(String[] args) {
	Scanner o = new Scanner(System.in);
	
	System.out.println("첫번째 들어갈 수");
	int a = o.nextInt();
	
	System.out.println("두번째 들어갈 수");
	int b = o.nextInt();
	
	int sum = a+b;
	
	System.out.println("두 수의 합은" + (sum) + "입니다.");
	
	
}
}
