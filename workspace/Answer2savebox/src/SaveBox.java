import java.util.Scanner;

public class SaveBox {
	int coin;// 얼마 가지고 있는지
	boolean isBroken = false;
	String name = "이름 미정";

	public void deposit() { // 입금
		System.out.println("입금할 금액을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		String inputCoinString = scanner.nextLine();
		int inputCoin = Integer.parseInt(inputCoinString);
		this.coin = this.coin + inputCoin;
		System.out.println("" + inputCoin + "이 입금되었습니다." + "현재금액은 " + this.coin + "입니다.");
	}

	public void withdraw() { // 출금
		System.out.println("" + this.coin + "이 출금되었습니다.");
		this.isBroken = true;
	}

	public void doAction() {
		if (this.isBroken) {
			System.out.println("이 저금통은 더이상 사용할 수 없습니다.");
			return;
		}

		System.out.println("1. 입금, 2. 출금, 3. 저금통 이름 지정, 4. 저금통 조회");
		Scanner scanner = new Scanner(System.in);
		String inputAction = scanner.nextLine();
		if (inputAction.equals("1")) {
			this.deposit();
		} else if (inputAction.equals("2")) {
			this.withdraw();
		} else if (inputAction.equals("3")) {
			this.setName();
		} else if (inputAction.equals("4")) {
			this.info();
		} else {
			System.out.println("입력이 잘못되었습니다. 다시 입력해주세요");
			this.doAction();
		}
	}

	public void setName() {
		System.out.println("변경할 이름을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		String inputName = scanner.nextLine();
		this.name = inputName;
	}

	public void info() {
		if (this.isBroken) {
			System.out.println(this.name + "(더이상 사용할 수 없습니다.)");
		} else {
			System.out.println(this.name + " (현재잔액 : " + this.coin + ")");
		}
	}
	public String toString() {
		String infoString = this.name + " (현재잔액 : " + this.coin + ")";
		return infoString;
	}
}
