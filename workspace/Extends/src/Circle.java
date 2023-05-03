import java.util.Scanner;

public class Circle extends Triangle {
	int halfWidth;
	Circle() {
		this.name = "원";
	}

	
	public void inputSize() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("halfWidth : ");
		String inputString = scanner.nextLine();
		this.halfWidth = Integer.parseInt(inputString);
	}
	
	public void calcSize() {
		this.size = this.halfWidth *this.halfWidth* Math.PI;
	}
}
