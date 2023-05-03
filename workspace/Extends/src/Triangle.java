import java.util.Scanner;

public class Triangle {
	String name;
	int width;
	int height;
	double size;
	Triangle(){
		this.name = "삼각형";
	}
	public void inputSize() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("width : ");
		String inputString = scanner.nextLine();
		this.width = Integer.parseInt(inputString);
		System.out.println("height : ");
		inputString = scanner.nextLine();
		this.height = Integer.parseInt(inputString);
	}
	public void calcSize() {
		this.size = this.width * this.height / (double)2;
	}
	public void printSize() {
		System.out.println(this.name + " size : " + this.size);
	}
	public void doAction() {
		this.inputSize();
		this.calcSize();
		this.printSize();
	}
}
