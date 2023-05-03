import java.util.Scanner;

public class Trapezoid extends Triangle {
	int width2;
	Trapezoid() {
		this.name = "마름모꼴";
	}
	
	public void inputSize() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("width : ");
		String inputString = scanner.nextLine();
		this.width = Integer.parseInt(inputString);
		System.out.println("width2 : ");
		inputString = scanner.nextLine();
		this.width2 = Integer.parseInt(inputString);
		System.out.println("height : ");
		inputString = scanner.nextLine();
		this.height = Integer.parseInt(inputString);
	}
	
	public void calcSize() {
		this.size = (this.width+this.width2) * this.height/(double)2;
	}
}
