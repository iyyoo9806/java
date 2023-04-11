import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		SaveBox s1 = new SaveBox();
		SaveBox s2 = new SaveBox();
		SaveBox s3 = new SaveBox();
		
		s1.setName("1번 저금통");
		s2.setName("2번 저금통");
		s3.setName("3번 저금통");
		
		for(int i=0; i<99999; i++) {
		System.out.println("1. 1번 저금통 입금");
		System.out.println("2. 2번 저금통 입금");
		System.out.println("3. 3번 저금통 입금");
		System.out.println("4. 1번 저금통 출금");
		System.out.println("5. 2번 저금통 출금");
		System.out.println("6. 3번 저금통 출금");
		System.out.println("q. 종료");
		String inputString = scanner.nextLine();
		if(inputString.equals("1")) {
		s1.deposit();
		}else if(inputString.equals("2")) {
		s2.deposit();
		}else if(inputString.equals("3")) {
		s3.deposit();
		}else if(inputString.equals("4")) {
			s1.withdarw();
		}else if(inputString.equals("5")) {
			s2.withdarw();
		}else if(inputString.equals("6")) {
			s3.withdarw();
		}else if(inputString.equals("q")) {
			System.out.println("종료되었습니다.");
			break;
		}
		else {
			System.out.println("입력값이 잘못되었습니다.");
		}
	}
	}
}