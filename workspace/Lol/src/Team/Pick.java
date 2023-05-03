package Team;
import java.util.Scanner;
import Champion.*;

public class Pick {
	String name;
	Team[] team = { new Team("블루팀"), new Team("레드팀") };
	public void pick() {
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			if (i == 1 || i == 4 || i == 5 || i == 8 || i == 9) {
				System.out.println("블루팀 선택입니다.");
				String selectChamp = scanner.nextLine();
				this.team[0].
			} else {
				System.out.println("레드팀 선택입니다.");
				String selectChamp = scanner.nextLine();
				this.team[1].
			}
		}
	}
}
