import java.util.Scanner;

public class SaveBox {
	int coin;
	String name = "돼지";
	boolean isBroken = false;
	
	public void deposit() {
		if (this.isBroken == true) {
			System.out.println("이 저금통은 깨졌습니다.");
			return;
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(this.name + "입금할 금액을 입력해주세요.");
		String inputString = scanner.nextLine();
		System.out.println("땡그랑");
		int inputCoin = Integer.parseInt(inputString);
		this.coin = this.coin + inputCoin;
		System.out.println(this.coin + " 만큼 저금되었습니다.");
	}

	public void withdarw() {
		
		System.out.println(this.name + "을 깼습니다.");
		System.out.println(this.name + "의 최종 출금 금액은 " + this.coin + " 입니다.");
		this.isBroken = true;
		this.coin = 0;
	}

	public void setName(String name) {
		this.name = name;
	}
}
