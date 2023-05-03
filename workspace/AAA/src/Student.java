import java.util.Scanner;

public class Student {

	String name;
	String address;
	String sex;
	Test[] test = new Test[2];
	int studentSum = 0;
	double studentAvg = 0;
	int middleSum =0;
	int finalSum =0;
	int middleAvg =0;
	int finalAvg =0;
	String number ="hi";

	public void studentName() {
		System.out.println("학생의 이름을 적으세요");
		Scanner scanner = new Scanner(System.in);
		this.name = scanner.nextLine();
	}

	public void studentAddress() {
		System.out.println("학생의 주소를 입력하세요");
		String[] addressList = { "서울", "경기", "강원", "전라", "경상", "충청"};
		for (int i = 0; i < 999; i++) {
			System.out.println("1. 서울 2. 경기 3. 강원 4. 전라 5. 경상 6. 충청");
			System.out.println("지역을 번호로 입력하세요");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();

			if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5")
					|| input.equals("6")) {
				int inputData = Integer.parseInt(input);
				this.address = addressList[inputData - 1];
				break;
			} else
				System.out.println("숫자 1~6 만 누르세요");
		}
	}

	public void studentSex() {
		for (int i = 0; i < 999; i++) {
			System.out.println("학생의 성별을 적으세요");
			System.out.println("1.남  2.여");
			String[] sexList = {"남", "여" };
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			if (input.equals("1") || input.equals("2")) {
				int inputData = Integer.parseInt(input);
				this.sex = sexList[inputData - 1];
				break;
			} else
				System.out.println("숫자 1~2 만 누르세요");

		}
	}

	public void studentInfo() {
		this.studentName();
		this.studentAddress();
		this.studentSex();
		
	}

	public void printInfo() {
		System.out.println("번호 : "+this.number+"  이름 : " + this.name + " 주소: " + this.address + " 성별 : " + this.sex);
	}

	public void studentTest() {
		test[0] = new Test();
		test[1] = new Test();
		System.out.println(this.name + "의 성적을 입력하세요.");
		System.out.println("중간고사 성적입력");
		this.test[0].inputScore();
		System.out.println("기말고사 성적입력");
		this.test[1].inputScore();
		this.sumTest();

	}



	public void sumTest() {
		middleSum = this.test[0].engScore + this.test[0].korScore + this.test[0].mathScore ;
		finalSum = this.test[1].engScore+ this.test[1].korScore + this.test[1].mathScore;
		middleAvg = middleSum/3;
		finalAvg = finalSum/3;
		studentSum = middleSum + finalSum;
		studentAvg = studentSum / 6;
	}
}