package Jw2;

import java.util.Random;
import java.util.Scanner;

public class Jwprac2 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	Random r = new Random();
	Random c = new Random();
	System.out.println("랜덤숫자놀이게임");
	System.out.println("0~100사이의 숫자를 입력해주세요.");
	System.out.println("입력 :");
	
	int userInt = s.nextInt();
	
	int randomInt = r.nextInt(101);
	int pcInt = r.nextInt(101);
	
	if(userInt>100 || userInt<0) {
		System.out.println("0~100사이의 숫자가 아닙니다.");
	}
	else if(userInt + randomInt == pcInt + randomInt) {
		System.out.println("사용자입력숫자는" + " " + userInt+","+"사용자입력숫자+랜덤숫자는"
	+ (userInt + randomInt) +","+"컴퓨터입력숫자+랜덤숫자는"+ (pcInt + randomInt) +","+"비겼습니다.");
	}else if(userInt + randomInt > pcInt + randomInt) {
		System.out.println("사용자입력숫자는" + " " + userInt+","+"사용자입력숫자+랜덤숫자는"
	+ (userInt + randomInt) +","+"컴퓨터입력숫자+랜덤숫자는"+ (pcInt + randomInt)+","+"이겼습니다.");
	}else {
		System.out.println("사용자입력숫자는" + " " + userInt+","+"사용자입력숫자+랜덤숫자는"
	+ (userInt + randomInt) +","+"컴퓨터입력숫자+랜덤숫자는"+ (pcInt + randomInt) +","+"졌습니다.");
	}
	
	
}
}



