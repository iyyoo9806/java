import java.util.Scanner;

public class SaveBox_0328 {
	int coin = 0; // 동전 갯수
	String name = null; // 이름 만들기에 사용
	boolean check = false; // 메소드 사용 가능 여부 확인용
	String choice = null;
	int inputCoin = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	public void deposit() { // 입금
		if (this.check == false) {
			System.out.println("입금을 할 수 없는 위치입니다.");
			return;
		}
		System.out.println(this.name + "저금통에 입금할 금액을 입력해주세요.");
		choice = scanner.nextLine();
		inputCoin = Integer.parseInt(choice);
		this.coin = this.coin + inputCoin;
		System.out.println("땡그랑");
		System.out.println(this.name + "저금통의 현재 보유 금액은 " + this.coin + "입니다.");
	}

	public void withdraw() { // 출금
		if(this.check==true) {
			System.out.println(this.name + " 저금통을 깼습니다.");
			System.out.println("최종 출금 금액은 " + this.coin + "입니다.");
			this.check = false;
		}else {
			System.out.println("이미 깨졌거나 없는 저금통입니다.");
			return;
		}
		}
		
	public void setName(String name) { // 이름 부여
			this.name = name;
	}
	
	public void create() { // 생성
		if(this.check==true) {
			System.out.println("불가능한 위치 입니다.");
			return;
		} else {
			this.check = true;
		}
		
	}
	
	public void search() {// 조회
		if(this.check == false) {
			System.out.println("이 위치엔 저금통이 없습니다.");
			return;
		} else if (this.check == true) {
			System.out.println("저금통의 이름은 " + this.name + "이며 잔고는 " + this.coin + "원 입니다.");
		}
		
	}
	
	
}
