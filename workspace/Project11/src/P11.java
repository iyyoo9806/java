import java.util.Random;
import java.util.Scanner;

public class P11 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	for(int i = 0; i<9999999; i++) {
	System.out.println((i+1)+" 번째 게임");
	System.out.println("게임을 진행하시려면 엔터, 종료하시려면 q를 입력해 주세요.");
	System.out.println("주사위를 굴릴까요");
	String userInput = scanner.nextLine();
	if(userInput.equals("q")) {
		break;
	}
	int userDice = random.nextInt(6)+1;
	System.out.println("사용자 주사위 : " + userDice);
	System.out.println("컴퓨터가 주사위를 굴립니다. 실행할까요?");
	scanner.nextLine();
	int comDice = random.nextInt(6)+1;
	System.out.println("컴퓨터 주사위 : "+comDice);
	
	if (userDice == comDice) {
		System.out.println("비겼습니다.");
	}else if(userDice < comDice) {
		System.out.println("컴퓨터가 이겼습니다.");
	}else {
		System.out.println("사용자가 이겼습니다.");
	}
	
	}
}
}