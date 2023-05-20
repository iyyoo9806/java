import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<Student>();

		for (;;) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("1. 학생 데이터 입력");
			System.out.println("2. 1등 출력");
			System.out.println("q. 종료");
			String inputString = scanner.nextLine();
			if (inputString.equals("q")) {
				System.out.println("종료되었습니다.");
				break;
			} else if (inputString.equals("1")) {
				try {
					System.out.println("학생 이름을 입력해주세요.");
					String name = scanner.nextLine();
					System.out.println("학생의 점수를 입력해주세요.");
					String inputScore = scanner.nextLine();
					int score = Integer.parseInt(inputScore);
					student.add(new Student(name, score));
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					System.out.println("점수에는 숫자만 입력 가능합니다.");
				}
			} else if (inputString.equals("2")) {
				try {
					for (int i = 0; i < student.size() - 1; i++) {
						for (int j = 0; j < student.size() - (i + 1); j++) {
							if (student.get(j).score < student.get(j + 1).score) {
								Student temp = student.get(j);
								student.set(j, student.get(j + 1));
								student.set(j + 1, temp);
							}
						}
					}
					System.out.println(student.get(0));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("학생의 정보가 없습니다.");;
				}
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		}

//		student.add(new Student("김",100));
//		student.add(new Student("나",90));
//		student.add(new Student("박",80));
//		student.add(new Student("이",70));	
//		

//		ArrayList<String> a = new ArrayList<String>();
//		a.add(new String("bb"));
//		a.get(0); //0번째 뽑아내기
//		System.out.println(a.get(0));
//		a.size(); // 길이 혹은 크기
////		Object b = new String("f");
////		String c = new String("p");
////		((String)b).getBytes();
////		c.getBytes();
	}
}
