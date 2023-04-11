import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		SaveBox[] saveBox = new SaveBox[100];
		int saveBoxCount = 0; // 저금통 생성 갯수 저장

		for (int i = 0; i < 99999; i++) {
			// 저금통 현재 목록 조회 출력
			System.out.println();
			System.out.println();
			System.out.println("---------------현재 저금통 목록---------------");
			for (int j = 0; j < saveBoxCount; j++) {
				System.out.println(j + " : ");
				saveBox[j].info(); 
//				이것을 아래와 같이 표현도 가능하다. 원래는 아래와 같이 표현하는것은 좋지 않다.
// 				현대 프로그래밍에서 아래와 같이 표현하는 것이 더 명확하고 간단하다면, 이렇게 표현한다.
//				System.out.println(saveBox[j].name + "(잔액 : " + saveBox[j].coin + ")");
//				System.out.println(saveBox[j]) -> 주소값 나옴 근데 toString 메소드 만들면
//				System.out.println(saveBox[j])
//				System.out.println(saveBox[j].toString()) 위 아래 동일
//				(toString 메소드 있으면 생략도 가능)
			}
			System.out.println();
			System.out.println("---------------원하시는 메뉴를 선택해 주세요.---------------");
			System.out.println("1. 저금통 생성");
			System.out.println("2. 저금통 액션(입금, 출금)");
			System.out.println("q. 종료");

			Scanner scanner = new Scanner(System.in);
			String menuSelect = scanner.nextLine();
			if (menuSelect.equals("q")) {
				System.out.println("종료되었습니다.");
				break;
			} else if (menuSelect.equals("1")) {
				// 저금통 생성
				if (saveBoxCount < saveBox.length) {
					saveBox[saveBoxCount] = new SaveBox();
					saveBoxCount++;
				} else {
					System.out.println("저금통 생성 개수를 초과했습니다.");
				}
			} else if (menuSelect.equals("2")) {
				// 저금통 액션
				System.out.println("현재 " + saveBoxCount + "개의 저금통이 있습니다. 0부터" + (saveBoxCount - 1) + "의 숫자입력");
				System.out.println("액션을 원하는 저금통의 숫자(INDEX)를 입력해주세요.");
				String saveBoxSelect = scanner.nextLine();
				// 정수인지 검사해서 종료(이번 수업에서는 들어가지 않음.)
				int selectNumber = Integer.parseInt(saveBoxSelect);
				if (selectNumber < 0 || selectNumber >= saveBoxCount) {
					System.out.println("입력된 값이 잘못되었습니다.");
					continue;
				}
				saveBox[selectNumber].doAction();
			} else {
				System.out.println("입력이 잘못되었습니다. 다시 입력해주세요");
			}
		}
	}
}
