import java.util.Scanner;

public class SaveCal_0328 {
	public static void main(String[] args) {
		int count = 100;// 배열 갯수
		String choice = null; // 문자로 선택
		int choiceNum = 0; // 숫자로 선택

		SaveBox_0328[] saveBox = new SaveBox_0328[count]; // 계좌 생성
		Scanner scanner = new Scanner(System.in); // 숫자 전용

		for (int i = 0; i <= saveBox.length - 1; i++) {
			saveBox[i] = new SaveBox_0328();
		}
		for (int i = 0; i < 99999; i++) { // 메뉴
			System.out.println("원하시는 메뉴를 선택해주세요.");
			System.out.println("1 : 저금통 생성");
			System.out.println("2 : 저금통 조회");
			System.out.println("3 : 입금");
			System.out.println("4 : 출금");
			System.out.println("q : 종료");
			// 종료
			choice = scanner.nextLine();
			if (choice.equals("q")) {
				System.out.println("종료하겠습니다.");
				break;
			}
			for (int j = 0; j < 9999; j++) {
				if (choice.equals("1")) { // 생성 및 이름부여
					System.out.println("저금통 생성을 고르셨습니다.");
					System.out.println("저금통의 이름을 입력해주세요.");
					choice = scanner.nextLine();
					System.out.println("저금통을 몇번째 칸에 두시겠습니까?");
					choiceNum = scanner.nextInt();
					saveBox[choiceNum].create();
					saveBox[choiceNum].setName(choice);
					System.out.println(choiceNum + "번째 칸에 " + saveBox[choiceNum].name + "저금통을 생성 후 두었습니다.");
					break;
				} else if (choice.equals("2")) {
					System.out.println("저금통 조회를 고르셨습니다.");
					System.out.println("몇번째 저금통을 조회하시겠습니까?");
					choice = scanner.nextLine();
					choiceNum = Integer.parseInt(choice);
					saveBox[choiceNum].search();
					System.out.println(choiceNum + "번째 저금통인 " + saveBox[choiceNum].name + "저금통의 잔고는 "
							+ saveBox[choiceNum].coin + "원 입니다.");
					break;
				} else if (choice.equals("3")) {
					System.out.println("입금을 고르셨습니다.");
					System.out.println("몇번째 저금통에 입금하시겠습니까?");
					choiceNum = scanner.nextInt();
					saveBox[choiceNum].deposit();
					break;
				} else if (choice.equals("4")) {
					System.out.println("출금을 고르셨습니다.");
					System.out.println("몇번재 저금통에서 출금하시겠습니까?");
					choiceNum = scanner.nextInt();
					saveBox[choiceNum].withdraw();
					break;
				} else {
					System.out.println("올바른 문자를 입력해주세요.");
					break;
				}

			}

		}
	}
}
