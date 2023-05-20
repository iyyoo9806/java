package quiz0516;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<Student>();
		student.add(new Student("가렌", 100));
		student.add(new Student("다리우스", 95));
		student.add(new Student("카타리나", 90));
		student.add(new Student("럭스", 85));
		student.add(new Student("케이틀린", 80));
		student.add(new Student("바이", 75));
		student.add(new Student("징크스", 70));
		student.add(new Student("요릭", 65));
		student.add(new Student("라이즈", 60));
		student.add(new Student("카시오페아", 55));
		student.add(new Student("트리스타나", 50));
		student.add(new Student("티모", 45));
		student.add(new Student("모데카이저", 40));
		student.add(new Student("리븐", 35));
		student.add(new Student("그웬", 30));
		student.add(new Student("세나", 25));
		student.add(new Student("루시안", 20));
		student.add(new Student("쓰레쉬", 15));
		student.add(new Student("미스포춘", 10));
		student.add(new Student("르블랑", 5));

		ArrayList<Room> room = new ArrayList<Room>();

		for (;;) {
			System.out.println("1. 반 추가");
			System.out.println("2. 원하는 반에 학생 추가");
			System.out.println("3. 반별 학생 목록 및 총점 출력");
			System.out.println("q. 종료");
			Scanner scanner = new Scanner(System.in);
			String selectMenu = scanner.nextLine();
			if (selectMenu.equals("q")) {
				System.out.println("종료");
				break;
			} else if (selectMenu.equals("1")) {
				System.out.println("반의 이름을 입력해 주세요.");
				room.add(new Room());
			} else if (selectMenu.equals("2")) {
				if (room.size() < 1) {
					System.out.println("최소 1개 반 이상 있어야 학생입력이 가능합니다.");
				} else {
					if (student.size() < 1) {
						System.out.println("학생이 없습니다.");
					} else {
						try {
							System.out.println("학생 목록 출력");
							for (int i = 0; i < student.size(); i++) {
								System.out.println(i + "번 학생" + student.get(i));
							}
							System.out.println("원하시는 학생의 번호를 입력하세요.");
							String inputStudent = scanner.nextLine();
							int studentNum = Integer.parseInt(inputStudent);
							System.out.println("현재까지 생성된 반의 목록입니다.");
							for (int i = 0; i < room.size(); i++) {
								System.out.println(i + "번 반 : " + room.get(i));
							}
							System.out.println("원하시는 반의 번호를 입력하세요");
							String inputRoom = scanner.nextLine();
							int roomNum = Integer.parseInt(inputRoom);
							room.get(roomNum).inputStudent(student.get(studentNum));
							student.remove(studentNum);
						} catch (NumberFormatException e) {
							// TODO Auto-generated catch block
							System.out.println("원하시는 학생 혹은 반을 선택하기 위해서는 해당 번호를 입력해야합니다.");
						}
					}
				}
			} else if (selectMenu.equals("3")) {
				System.out.println("반별 학생목록 및 총점");
				for (int i = 0; i < room.size(); i++) {
					System.out.println(room.get(i));
					room.get(i).printStudent();
					room.get(i).totalScore();
					System.out.println("------------");
				}

			} else {
				System.out.println("잘못된 입력");
			}
		}

	}
}
