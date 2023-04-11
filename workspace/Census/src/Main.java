import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("원하시는 표본 개수를 적으시오.");
		Scanner scanner = new Scanner(System.in);
		int inputInt = scanner.nextInt();
//		String inputString = scanner.nextLine();
//		int inputInt = Integer.parseInt(inputString);
		People[] people = new People[inputInt];
		
		for (int i = 0; i < people.length; i++) {
			// 객체 생성
			people[i] = new People();
			// 데이터 입력
			people[i].inputData();
		}

		int regionNum1 = 0;
		int regionNum2 = 0;
		int regionNum3 = 0;
		int regionNum4 = 0;
		int regionNum5 = 0;
		int regionNum6 = 0;
		int maleNum = 0;
		int femaleNum = 0;
		String total = null;
		for (int i = 0; i < people.length; i++) {
			regionNum1 += people[i].regionNum1;
			regionNum2 += people[i].regionNum2;
			regionNum3 += people[i].regionNum3;
			regionNum4 += people[i].regionNum4;
			regionNum5 += people[i].regionNum5;
			regionNum6 += people[i].regionNum6;
			maleNum += people[i].maleNum;
			femaleNum += people[i].femaleNum;
		}
		for(int i=0; i<people.length;i++) {
			people[i].total();
		}
		
		System.out.println();
		System.out.println();
		System.out.println("지역별 인구");
		System.out.println("서울 총 인구 : " + regionNum1);
		System.out.println("경기 총 인구 : " + regionNum2);
		System.out.println("강원 총 인구 : " + regionNum3);
		System.out.println("충청 총 인구 : " + regionNum4);
		System.out.println("전라 총 인구 : " + regionNum5);
		System.out.println("경상 총 인구 : " + regionNum6);
		System.out.println();
		System.out.println();
		System.out.println("성별 인구");
		System.out.println("남성 인구 : " + maleNum);
		System.out.println("여성 인구 : " + femaleNum);
	}
}
