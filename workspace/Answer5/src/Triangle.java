import java.util.Scanner;

public class Triangle extends Base {
	private int width;
	private int height;

	Triangle() {
		this.name = "삼각형";
	}

	@Override
	protected void inputNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("width : ");
		String inputString = scanner.nextLine();
		this.width = Integer.parseInt(inputString);
		System.out.println("height : ");
		inputString = scanner.nextLine();
		this.height = Integer.parseInt(inputString);
	}

	@Override
	protected void calSize() {
		this.size = this.height * this.width / (double) 2;
	}
}
