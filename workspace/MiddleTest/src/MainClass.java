import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Store[] store = { new Store("백화점") };

		for (int i = 0; i < 99999; i++) {
			System.out.println("1.상품 등록");
			System.out.println("2.상품 목록 출력");
			System.out.println("3.상품 통계");
			System.out.println("4.상품 정렬");
			System.out.println("5.구매서 작성");
			System.out.println("6.구매서 목록");
			System.out.println("q.종료");
			String inputString = scanner.nextLine();
			if (inputString.equals("1")) {
				store[0].addProduct();
			} else if (inputString.equals("2")) {
				store[0].printProduct();
			} else if (inputString.equals("3")) {
				store[0].printStats();
			} else if (inputString.equals("4")) {
				System.out.println("높은 가격 순");
				store[0].printDiscountHigh();
				System.out.println("-------------");
				System.out.println("낮은 가격 순");
				store[0].printDiscountLow();
				System.out.println("-------------");
				System.out.println("할인율 높은 순");
				store[0].printDiscountHigh();
				System.out.println("-------------");
				System.out.println("할인율 낮은 순");
				store[0].printDiscountLow();
			} else if (inputString.equals("5")) {
				store[0].order();
			} else if (inputString.equals("6")) {
				store[0].printOder();
			} else if (inputString.equals("q")) {
				break;
			}
		}
	}
}
