package mainPackage;
import java.util.Scanner;

public class Prac1 {
public static void main(String[] args) {
	Scanner i = new Scanner(System.in);
	
	System.out.println("첫번째 들어갈 수");
	int a = i.nextInt();
	
	System.out.println("두번째 들어갈 수");
	int b = i.nextInt();
	
	System.out.println("세번째 들어갈 수");
	int c = i.nextInt();
	
	int sum = a+b+c;
	
	System.out.println("세 수의 합은" + (sum) + "입니다.");
}

}
