import java.util.Random;

public class Mainclass {
public static void main(String[] args) {
Random r = new Random();
	
	int number = r.nextInt(100);
	System.out.println("랜덤 숫자 : " + number);
	
	System.out.println("나머지 값 : " + (number % 2));
	
	double d = r.nextDouble();
	System.out.println(d);
	
	int number2 = r.nextInt(26) + 65;
	System.out.println(number2);
	char c = (char)number2;
	System.out.println(c);
	
}
	
}
