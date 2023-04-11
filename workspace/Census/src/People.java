
import java.util.Scanner;

public class People {
	String name = "미정";
	String region = "서울";
	String gender = "몰?루";
	int regionNum1 = 0;
	int regionNum2 = 0;
	int regionNum3 = 0;
	int regionNum4 = 0;
	int regionNum5 = 0;
	int regionNum6 = 0;
	int maleNum = 0;
	int femaleNum = 0;

	public void inputData() {
		this.inputName();
		this.customRegion();
		this.region();
		this.gender();
	}

	public void inputName() {
		System.out.println("이름을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.next();
		this.name = inputString;
	}

	public void region() {

		System.out.println("원하는 지역의 숫자를 입력해 주세요.");
		Scanner scanner = new Scanner(System.in);
		

		boolean flag = false;
		for (;;) {
			if (flag == true)
				break;
			String inputString = scanner.next();
			if (inputString.equals("1")) {
				this.region = "서울"; // scanner.nextLine();
				this.regionNum1 = this.regionNum1 + 1;
				flag = true;
			} else if (inputString.equals("2")) {
				this.region = "경기";
				this.regionNum2 = this.regionNum2 + 1;
				flag = true;
			} else if (inputString.equals("3")) {
				this.region = "강원";
				this.regionNum3 = this.regionNum3 + 1;
				flag = true;
			} else if (inputString.equals("4")) {
				this.region = "충청";
				this.regionNum4 = this.regionNum4 + 1;
				flag = true;
			} else if (inputString.equals("5")) {
				this.region = "전라";
				this.regionNum5 = this.regionNum5 + 1;
				flag = true;
			} else if (inputString.equals("6")) {
				this.region = "경상";
				this.regionNum6 = this.regionNum6 + 1;
				flag = true;
			} else {
				System.out.println("올바른 지역을 입력해주세요.");
				flag = false;
			}
		}

	}

	public void gender() {
		System.out.println("성별을 입력해주세요.");
		System.out.println("1.남성 2.여성");
		Scanner scanner = new Scanner(System.in);
		boolean flag = false;
		for (;;) {
			if (flag == true)
				break;
			String inputString = scanner.next();
			if (inputString.equals("1")) {
				this.gender = "남성";
				this.maleNum = this.maleNum + 1;
				flag = true;
			} else if (inputString.equals("2")) {
				this.gender = "여성";
				this.femaleNum = this.femaleNum + 1;
				flag = true;
			} else {
				System.out.println("올바른 성별을 입력해주세요.");
				flag = false;
			}
		}
	}

	public void total() {
		System.out.println(this.name + " " + this.region + " " + this.gender);
	}

}
