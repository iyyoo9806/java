import java.util.Scanner;

public class Classroom {
	String name;
	int maxStudent = 100;
	Student[] student = new Student[maxStudent];
	int studentCount = 0;
	Scanner scanner = new Scanner(System.in);

	public void classStudent() {
		for (int i = 0; i < 9999; i++) {
			System.out.println(this.name + "반의 입력입니다.");
			System.out.println("1.학생추가 2.성적입력 q.뒤로가기");
			
			String menu = scanner.nextLine();

			if (menu.equals("1")) {
				if (studentCount < maxStudent) {
					student[studentCount] = new Student();
					student[studentCount].studentInfo();

					student[studentCount].number = Integer.toString(studentCount + 1);
					student[studentCount].printInfo();
					this.studentCount++;
					
				} else {
					System.out.println("인원을 추가할수 없습니다. 최대 인원수는 " + maxStudent + "입니다.");
				}

			} else if (menu.equals("2")) {
				for (int j = 0; j < 999; j++) {
					System.out.println("몇번 학생의 성적을 입력하시겠습니까 q.뒤로가기");
					

					String inputNum = scanner.nextLine();
					boolean checkNum = true;

					if (inputNum.equals("q")) {
						break;
					}
					for (int k = 0; k < studentCount; k++) {
						if (student[k].number.equals(inputNum)) {
							student[k].studentTest();
							checkNum = false;
							break;

						}
					}
					if (checkNum) {
						System.out.println("그 번호의 학생이 없습니다.");
					}
				}
			} else if (menu.equals("q")) {
				break;
			} else {
				System.out.println("1,2 만 누르세요");
			}
		}
	}

	public void namingRoom() {
		System.out.println("반의 이름을 적으세요");
		Scanner scanner = new Scanner(System.in);
		this.name = scanner.nextLine();
	}

	public void printClass() {
		System.out.println("반 이름: " + this.name + "학생수 : " + this.studentCount + "명");
	}
}