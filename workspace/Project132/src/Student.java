import java.util.Scanner;

public class Student {
	String name;
	int korSum;
	int korAvg;
	int engSum;
	int engAvg;
	int mathSum;
	int mathAvg;

	public void setName() {
		System.out.println("학생의 이름을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String inputName = scanner.nextLine();
		this.name = inputName;
	}

	public void point() {
		System.out.println("학생의 국영수 점수를 차례로 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		String korString = scanner.nextLine();
		int korPoint = Integer.parseInt(korString);
		String engString = scanner.nextLine();
		int engPoint = Integer.parseInt(engString);
		String mathString = scanner.nextLine();
		int mathPoint = Integer.parseInt(mathString);
		if(korPoint>100 && korPoint<0||engPoint>100 && engPoint<0||mathPoint>100 && mathPoint<0) {
			System.out.println("점수는 100초과 0미만이 될 수 없습니다.");
		}else {
		System.out.println(this.name + " 학생의 점수 " + "국어 : " + korPoint + " 영어 : " + engPoint + " 수학 : " + mathPoint);
		this.korSum = this.korSum + korPoint;
		this.engSum = this.engAvg + engPoint;
		this.mathSum = this.mathSum + mathPoint;
		}
	}

	public void pointSum() {
		System.out.println("30명 학생의 국어 총점은 : " + this.korSum + " 영어 총점은" + this.engSum + " 수학 총점은" + this.mathSum + " 입니다.");
	}
	public void pointAvg() {
		System.out.println("30명 학생의 국어 평균은 : " + (this.korSum/30) + " 영어 총점은" + (this.engSum/30) + " 수학 총점은" + (this.mathSum)/30 + " 입니다.");
	}
}
