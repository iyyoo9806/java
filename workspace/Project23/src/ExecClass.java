import java.util.Random;
public class ExecClass {
public static void main(String[] args) {
	Random r = new Random();
	int randomValue = r.nextInt(100);
	System.out.println(randomValue);
	if(randomValue%2 == 0 ) {
		System.out.println("짝수입니다.");
	}else {
			System.out.println("홀수입니다.");
		}
	
}
}
