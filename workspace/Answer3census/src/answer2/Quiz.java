package answer2;

import java.util.Scanner;

public class Quiz {
public static void main(String[] args) {
	ClassRoom A = new ClassRoom();
	ClassRoom B = new ClassRoom();
	ClassRoom C = new ClassRoom();
	
	
	Scanner scanner = new Scanner(System.in);
	for(int i=0; i<999999; i++) {
		System.out.println("1. 반 선택");
		System.out.println("2. 반 별 전체조회");
		System.out.println("3. 통계");
		System.out.println("q. 종료");
		String inputString = scanner.nextLine();
		if(inputString.equals("1")) {
			System.out.println("1. A반");
			System.out.println("2. B반");
			System.out.println("3. C반");
			String inputString2 = scanner.nextLine();
			if(inputString2.equals("1")) {
				A.inputRoom("A");
			}if(inputString2.equals("2")) {
				B.inputRoom("B");
			}if(inputString2.equals("3")) {
				C.inputRoom("C");
			}
			
		}else if(inputString.equals("2")) {
			System.out.println("A반 전체");
			A.infoRoom();
			System.out.println();
			System.out.println("B반 전체");
			B.infoRoom();
			System.out.println();
			System.out.println("C반 전체");
			C.infoRoom();
			
		}else if(inputString.equals("3")) {
			System.out.println("A반 전체");
			A.mdStat();
			A.LsStat();
			System.out.println();
			System.out.println("B반 전체");
			B.mdStat();
			B.LsStat();
			System.out.println();
			System.out.println("C반 전체");
			C.mdStat();
			C.LsStat();
			
			
		}else {
			System.out.println("잘못된 값을 입력했습니다.");
		}
	}
}
}
