package Quiz;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Base[] figure = new Base[10];

//		Base[]b = new Base[3];
//		b[0] = new Triangle();
//		b[0].doAction();
		for (int i = 0; i < figure.length; i++) {
			System.out.println(i + "번째 도형을 무엇으로 할까요?");
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
		
		
		for(int i=0; i<figure.length; i++) {
			System.out.println(i+"번 도형");
			figure[i].doAction();
			System.out.println("------");
		}
	}
}
