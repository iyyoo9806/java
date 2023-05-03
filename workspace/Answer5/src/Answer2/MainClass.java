package Answer2;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Base[] figure = new Base[10];

		//도형 선택
		for (int i = 0; i < figure.length; i++) {
			System.out.println(i + "번째 도형을 무엇으로 할까요?");
			System.out.println("1. 삼각형, 2.사각형, 3.원");
			Scanner scanner = new Scanner(System.in);
			String inputString = scanner.nextLine();
			if (inputString.equals("1")) {
				figure[i] = new Triangle();
			} else if (inputString.equals("2")) {
				figure[i] = new Square();
			} else if (inputString.equals("3")) {
				figure[i] = new Circle();
			} 
		}

		// 배열 안에 선택된 도형에 대한 doAction 실행
		for (int i = 0; i < figure.length; i++) {
			if(figure[i]==null) {
				continue;
			}
			System.out.println(i + "번 도형");
			figure[i].doAction();
			System.out.println("------");
		}
//		Triangle t1 = new Triangle();
//		t1.test1();
//		Base t2 = new Triangle();
//		t2.test1();
//		아래 t2.test1()은 못씀
//		강제로 쓸 경우 캐스팅
//		아래에 예시
		
//		Triangle t1 = new Triangle();
//		t1.test1();
//		Base t2 = new Triangle();
//		((Triangle)t2).test1();
	}
}
