import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SaveBox[] saveBox = new SaveBox[100];
		String select = null;
		String name = null;
		for (int i = 0; i < saveBox.length; i++) {
			saveBox[i] = new SaveBox();
		}

		for (int i = 0; i < 999999; i++) {
			System.out.println("메뉴");
			System.out.println("1. 저금통 생성");
			System.out.println("2. 저금통 조회");
			System.out.println("3. 입금");
			System.out.println("4. 출금");
			System.out.println("q. 종료");
			String inputString = scanner.nextLine();
			if (inputString.equals("q")) {
				System.out.println("종료되었습니다.");
				break;
			}
			for (int j = 0; j < 999999; j++) {
				if (inputString.equals("1")) {
					System.out.println("이름을 입력해 주세요.");
					name = scanner.nextLine();
					System.out.println("몇번째 배열에 저금통을 두시겠습니까?");
					select = scanner.nextLine();
					int selectNum = Integer.parseInt(select);
					saveBox[selectNum].createBox();
					saveBox[selectNum].setName(name);
					System.out.println(select + "번째 배열에 " + name + "저금통이 생성되었습니다.");
					break;
				} else if (inputString.equals("2")) {
					System.out.println("조회하고자 하는 저금통의 위치를 적어주세요.");
					select = scanner.nextLine();
					int selectNum = Integer.parseInt(select);
					saveBox[selectNum].checkBox();
					System.out.println("조회하신 " + selectNum + "배열의 저금통 잔고는" + saveBox[selectNum].coin + " 원입니다.");
					break;

				} else if (inputString.equals("3")) {
					System.out.println("입금하고자 하는 저금통의 위치를 적어주세요.");
					select = scanner.nextLine();
					int selectNum = Integer.parseInt(select);
					saveBox[selectNum].deposit();
					break;

				} else if (inputString.equals("4")) {
					System.out.println("출금하고자 하는 저금통의 위치를 적어주세요.");
					select = scanner.nextLine();
					int selectNum = Integer.parseInt(select);
					saveBox[selectNum].withdarw();
					break;

				} else {
					System.out.println("잘못된 입력입니다.");
					break;
				}
			}
		}
	}
}
