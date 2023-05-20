package answer0516;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> student = new ArrayList<Student>();
		for (;;) {
			System.out.println("1. 데이터 입력");
			System.out.println("2. 전체 데이터 출력");
			System.out.println("3. 최고 성적자 출력");
			System.out.println("q. 종료");
			String menuSelect = scanner.nextLine();
			if (menuSelect.equals("1")) {
				student.add(new Student());

			} else if (menuSelect.equals("2")) {
				for (int i = 0; i < student.size(); i++) {
					System.out.println(student.get(i));
				}

			}else if (menuSelect.equals("3")) {
				try {
					int maxScore = Integer.MIN_VALUE;
					for (int i = 0; i < student.size(); i++) {
						if(student.get(i).score>maxScore) {
							maxScore = student.get(i).score;
						}
					}
					for(int i=0; i<student.size(); i++) {
						if(student.get(i).score==maxScore) {
							System.out.println(student.get(i));
						}
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("학생의 정보가 없습니다.");;
				}
			} else if (menuSelect.equals("q")) {
				break;
			}
		}
	}
}
