import java.util.Scanner;

public class ForthJw {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	for(int i = 0; i<999999; i++) {
		System.out.println("숫자를 입력하세요");
		String inputString = s.nextLine();
		int inputNumber = Integer.parseInt(inputString);
		
		if(inputNumber%2==0) {
			System.out.println(7*inputNumber +" "+"짝수");
			break;
		}else
			System.out.println(7*inputNumber);
			break;
		}
	}
	
}

