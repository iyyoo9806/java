import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("게임을 시작하시겠습니까? y/n");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		if (inputString.equals("y")) {
			System.out.println("게임이 시작합니다.");
		} else if (inputString.equals("n")) {
			System.out.println("종료합니다.");
		} else {
			System.out.println("입력이 잘못되었습니다.");
			System.out.println("다시 실행해주세요.");
		}
	}
}
