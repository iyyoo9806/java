import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Student[] student = new Student[30];
		int studentCount = 0;
		
		for(int i =0; i<99999; i++) {
			System.out.println("1. 학생 점수 입력");
			System.out.println("2. 총점 확인");
			System.out.println("3. 평균 확인");
			System.out.println("q. 종료");
			
			Scanner scanner = new Scanner(System.in);
			String menuSelect = scanner.nextLine();
			if(menuSelect.equals("q")) {
				System.out.println("종료되었습니다.");
				break;
			}else if(menuSelect.equals("1")) {
				if(studentCount < student.length) {
					student[studentCount] = new Student();
					studentCount++;
					student[studentCount].point();
				}else {
					System.out.println("30명의 데이터가 전부 입력되었습니다.");
				}
			}else if(menuSelect.equals("2")) {
				System.out.println("현재 " + studentCount + "명의 학생 점수를 입력했습니다.");
				if(studentCount<student.length) {
					System.out.println("아직 모든 학생의 점수입력이 완료되지 않았습니다.");
					continue;
				}else {
					student[studentCount].pointSum();
				}
			}else if(menuSelect.equals("3")) {
				System.out.println("현재 " + studentCount + "명의 학생 점수를 입력했습니다.");
				if(studentCount<student.length) {
					System.out.println("아직 모든 학생의 점수입력이 완료되지 않았습니다.");
					continue;
				}else {
					student[studentCount].pointAvg();
				}
			}
			
		}
		
		
	}
}
