import java.util.Scanner;

public class Kaup {
	public void calKaup() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력하세요");
		double height = scanner.nextDouble();
		System.out.println("몸무게를 입력하세요");
		double weight = scanner.nextDouble();
		double kaupPoint = weight / ((height / 100) * (height / 100));
		int kaupPoint2 = (int) kaupPoint;
		if (kaupPoint >= 30) {
			System.out.println("카우프 지수는 "+ kaupPoint2 +" 비만");
		} else if (kaupPoint > 23 && weight / kaupPoint < 30) {
			System.out.println("카우프 지수는 "+ kaupPoint2 +" 과체중");
		} else if (kaupPoint > 19 && weight / kaupPoint < 25) {
			System.out.println("카우프 지수는 "+ kaupPoint2 +" 정상");
		} else if (kaupPoint > 15 && kaupPoint < 20) {
			System.out.println("카우프 지수는 "+ kaupPoint2 +" 저체중");
		} else if (kaupPoint > 12 && kaupPoint < 16) {
			System.out.println("카우프 지수는 "+ kaupPoint2 +" 여윔");
		} else if (kaupPoint > 9 && kaupPoint < 14) {
			System.out.println("카우프 지수는 "+ kaupPoint2 +" 영양 실조증");
		} else {
			System.out.println("카우프 지수는 "+ kaupPoint2 +" 이하는 소모증");
		}
	}
}
