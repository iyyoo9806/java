import java.util.Random;

public class Maincalss2 {
public static void main(String[] args) {
	Random i = new Random();
	int randomValue = i.nextInt(100);
	System.out.println(randomValue);
	if(randomValue % 2 == 0) {
		System.out.println("짝수입니다.");
	} 
	else {
		System.out.println("홀수입니다.");
	}
int a = 100;
if(a<10) {
	System.out.println("111");
}else if(a <20) {
	System.out.println("2222");
}else if (a<30) {
	System.out.println("3333");
}else {
	System.out.println("4444");
}
}
}
