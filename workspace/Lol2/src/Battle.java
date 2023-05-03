import java.util.Random;
import java.util.Scanner;

public class Battle {
	String name;
	Garen garen = new Garen();
	Darius darius = new Darius();
	int garenNum = 0;
	int dariusNum = 0;
	boolean garenSkill = false;
	boolean dariusSkill = false;

	public void battlePhase() {
		System.out.println("전투를 시작합니다.");
		if (this.garenNum > this.dariusNum) {
			Random random = new Random();
			System.out.println("가렌이 선공입니다.");
			System.out.println("가렌의 스킬을 사용하시겠습니까?(y/n)");
			Scanner scanner = new Scanner(System.in);
			String inputSkill = scanner.nextLine();

			if (inputSkill.equals("y")) {
				if (this.garenSkill = false) {
					darius.hp = darius.hp - (darius.defense - garen.attack) - random.nextInt(10) - garen.skillEffect;
					System.out.println(garen.hp + "" + darius.hp);
					this.garenSkill = true;
				} else {
					System.out.println("이미 스킬을 사용했습니다.");
					return;
				}
			} else if (inputSkill.equals("n")) {
				darius.hp = darius.hp - (darius.defense - garen.attack) - random.nextInt(10);
				System.out.println(garen.hp + "" + darius.hp);
			}else {
				System.out.println("잘못된 값입니다. 다시 입력해주세요.");
				return;
			}
			
			System.out.println("다리우스의 후공입니다.");
			System.out.println("다리우스의 스킬을 사용하시겠습니까?");
			if (inputSkill.equals("y")) {
				if (this.dariusSkill = false) {
					garen.hp = garen.hp - (garen.defense - darius.attack) - random.nextInt(10) - darius.skillEffect;
					System.out.println(garen.hp + "" + darius.hp);
					this.dariusSkill = true;
				} else {
					System.out.println("이미 스킬을 사용했습니다.");
					return;
				}
			} else if (inputSkill.equals("n")) {
				garen.hp = garen.hp - (garen.defense - darius.attack) - random.nextInt(10);
				System.out.println(garen.hp + "" + darius.hp);
			}else {
				System.out.println("잘못된 값입니다. 다시 입력해주세요.");
				return;
			}

			if (darius.hp != 0 && garen.hp != 0) {
				System.out.println("전투는 계속됩니다.");
				battleSelectFirst();
			} else if (darius.hp == 0) {
				System.out.println("가렌의 승리입니다.");
			} else {
				System.out.println("다리우스의 승리입니다.");
			}

		} else {
			Random random = new Random();
			System.out.println("다리우스의 선공입니다.");
			System.out.println("다리우스의 스킬을 사용하시겠습니까?(y/n)");
			Scanner scanner = new Scanner(System.in);
			String inputSkill = scanner.nextLine();

			if (inputSkill.equals("y")) {
				if (this.dariusSkill = false) {
					garen.hp = garen.hp - (garen.defense - darius.attack) - random.nextInt(10) - darius.skillEffect;
					System.out.println(garen.hp + "" + darius.hp);
					this.dariusSkill = true;
				} else {
					System.out.println("이미 스킬을 사용했습니다.");
					return;
				}
			} else if (inputSkill.equals("n")) {
				garen.hp = garen.hp - (garen.defense - darius.attack) - random.nextInt(10);
				System.out.println(garen.hp + "" + darius.hp);
			}else {
				System.out.println("잘못된 값입니다. 다시 입력해주세요.");
				return;
			}
			
			System.out.println("가렌의 후공입니다.");
			System.out.println("가렌의 스킬을 사용하시겠습니까?");
			if (inputSkill.equals("y")) {
				if (this.garenSkill = false) {
					darius.hp = darius.hp - (darius.defense - garen.attack) - random.nextInt(10) - garen.skillEffect;
					System.out.println(garen.hp + "" + darius.hp);
					this.garenSkill = true;
				} else {
					System.out.println("이미 스킬을 사용했습니다.");
					return;
				}
			} else if (inputSkill.equals("n")) {
				darius.hp = darius.hp - (darius.defense - garen.attack) - random.nextInt(10);
				System.out.println(garen.hp + "" + darius.hp);
			}else {
				System.out.println("잘못된 값입니다. 다시 입력해주세요.");
				return;
			}

			if (darius.hp != 0 && garen.hp != 0) {
				System.out.println("전투는 계속됩니다.");
				battleSelectFirst();
			} else if (darius.hp == 0) {
				System.out.println("가렌의 승리입니다.");
			} else {
				System.out.println("다리우스의 승리입니다.");
			}

		}
	}

	public void battleSelectFirst() {
		System.out.println("선공 선택");
		Random random = new Random();
		System.out.println("가렌 숫자");
		int garenNum = random.nextInt(10) + 1;
		System.out.println(garenNum);
		System.out.println("다리우스 숫자");
		int dariusNum = random.nextInt(10) + 1;
		System.out.println(dariusNum);
		if (garenNum == dariusNum) {
			System.out.println("숫자가 같습니다. 다시 숫자를 뽑습니다.");
			battleSelectFirst();
		} else if (garenNum > dariusNum) {
			System.out.println("가렌이 선공입니다.");
			this.garenNum++;
			battlePhase();
		} else {
			System.out.println("다리우스가 선공입니다.");
			this.dariusNum++;
			battlePhase();
		}
	}
}
