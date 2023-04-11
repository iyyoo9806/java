import java.util.Scanner;

public class SaveBox {
	int coin = 0;
	String name = null;
	boolean isBroken = false;
	boolean create = false;
	Scanner scanner = new Scanner(System.in);

	public void deposit() {
		if (this.isBroken) {
			System.out.println("이 저금통은 깨졌습니다.");
			return;
		}
		System.out.println(this.name + "입금할 금액을 입력해주세요.");
		String inputString = scanner.nextLine();
		System.out.println("땡그랑");
		int inputCoin = Integer.parseInt(inputString);
		this.coin = this.coin + inputCoin;
		System.out.println(this.coin + " 만큼 저금되었습니다.");
	}

	public void withdarw() {
		if (this.isBroken) {
			System.out.println("이미 깨진 저금통입니다.");
			return;
		} else {
			System.out.println(this.name + "을 깼습니다.");
			System.out.println(this.name + "의 최종 출금 금액은 " + this.coin + " 입니다.");
			this.isBroken = true;
			this.coin = 0;
		}

	}

	public void setName(String name) {
		this.name = name;
	}

	public void createBox() {
		if (this.create) {
			System.out.println("이미 생성된 위치입니다.");
			return;
		} else {
			this.create = true;
		}
	}

	public void checkBox() {
		if (this.create == false) {
			System.out.println("이 위치에는 아직 저금통이 생성되지 않았습니다.");
			return;
		}else if(this.isBroken == true) {
			System.out.println("이 저금통은 깨진 저금통입니다.");
			return;
		}
		else {
			System.out.println("저금통 이름 : " + this.name);
			System.out.println("잔고 : " + this.coin + "원 입니다.");
		}
	}

}
