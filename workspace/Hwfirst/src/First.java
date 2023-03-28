import java.util.Random;
import java.util.Scanner;

public class First {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in); // 라이브러리 선언
	Random r = new Random(); // 라이브러리 선언
	int totalCount = 0;  //전체 경기 수
	int vicCount = 0;    //승리 경기 수
	
	for (int i = 0; i<99999; i++) { //반복문 작성
	
	int randomInt = r.nextInt(3); // 입력되는 랜덤값은 0부터 2까지
	System.out.println("0 = 가위, 1 = 바위, 2 = 보 , q = 종료");
	String inputString = s.nextLine(); // 플레이어가 입력하는 값
	
	if(inputString.equals("q")) { // q를 눌렀을 때
		System.out.println("종료되었습니다."); // 종료되었습니다. 문구 출력
		System.out.println("전체경기는" +totalCount + "회 입니다.");
		System.out.println("이긴경기는" + vicCount + "회 입니다.");
		System.out.println("승률은" + " " + ((vicCount/(double)totalCount)*100)+ "%" + " " + "입니다.");
		// 승률은 (승리 수/ 전체 경기 수)*100 입니다.
		break; // 정지
	}
	
	int inputNumber = Integer.parseInt(inputString); // String을 문자로 변환
	
	if(randomInt == 0) { // if문 : 컴퓨터가 0(가위) 일 때 경우
		if(inputNumber == 1) {
			System.out.println("이겼습니다.");
			totalCount++;
			vicCount++;
		}else if(inputNumber == 2) {
			System.out.println("졌습니다.");
			totalCount++;
		}else if(inputNumber == 0) {
			System.out.println("비겼습니다.");
			totalCount++;
		}else {
			System.out.println("입력값이 잘못되었습니다. 다시 입력해 주세요.");
		}
	}
	if(randomInt == 1) { // if문 : 컴퓨터가 1(바위) 일 때 경우
		if(inputNumber == 2) {
			System.out.println(("이겼습니다."));
			totalCount++;
			vicCount++;
		}else if(inputNumber == 0) {
			System.out.println("졌습니다.");
			totalCount++;
		}else if(inputNumber == 1) {
			System.out.println("비겼습니다.");
			totalCount++;
		}else {
			System.out.println("입력값이 잘못되었습니다. 다시 입력해 주세요.");
		}
		}
	if(randomInt == 2) { // if문 : 컴퓨터가 2(보) 일 때 경우
		if(inputNumber == 0) {
			System.out.println("이겼습니다.");
			totalCount++;
			vicCount++;
		}else if(inputNumber == 1) {
			System.out.println("졌습니다.");
			totalCount++;
		}else if(inputNumber == 2) {
			System.out.println("비겼습니다.");
			totalCount++;
		}else {
			System.out.println("입력값이 잘못되었습니다. 다시 입력해 주세요.");
		}
	}
	}
}
}



