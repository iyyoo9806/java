import java.util.Random;
import java.util.Scanner;

public class P13quiz {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Random userRan = new Random();
	Random comRan = new Random();
	for(int i=0; i<99999; i++) {
		System.out.println("주사위를 굴릴까요?");
		
	int userNum = userRan.nextInt(5)+1;
	int comNum = comRan.nextInt(5)+1;
	
	String inputS = scanner.nextLine();
	if(inputS.equals("")) {
	System.out.println(userNum);
		System.out.println("컴퓨터가 주사위를 굴립니다. 실행할까요?");}
	
	String inputSs = scanner.nextLine();
	System.out.println(comNum);
	
	if(userNum == comNum) {
		System.out.println("Draw");
		
	}else if(userNum > comNum) {
		System.out.println("You Win!");
		
	}else {
		System.out.println("You Lose!");
		
	}
	System.out.println("계속 진행하실거면 엔터를 눌러주세요");
		scanner.nextLine();
	}
}
}
