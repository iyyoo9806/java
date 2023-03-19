package Jw2;

import java.util.Random;
import java.util.Scanner;

public class JwQuiz {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	Random r = new Random();
	System.out.println("숫자를 입력하세요(0~100)");
	int inputNumber = s.nextInt();
	int randomNumber = r.nextInt(10)+1;
	if(inputNumber<0||inputNumber>100) {
		System.out.println("숫자가 큽니다.");
	}if(inputNumber==0) {
		System.out.println("숫자 0은 나눈값이 0입니다.");
	}
	else if((inputNumber/randomNumber)%2==1) {
		System.out.println("당신의 숫자 "+ inputNumber + "에서 임의의 값 "
				+ randomNumber +"을 나눈 값은"+(inputNumber/randomNumber)
				+"이고 해당숫자는 홀수입니다.");
	}else {
		System.out.println("당신의 숫자 "+ inputNumber + "에서 임의의 값 "
				+ randomNumber +"을 나눈 값은"+(inputNumber/randomNumber)
				+"이고 해당숫자는 짝수입니다.");
	}
	
}
}


