import java.util.Scanner;

public class Square extends Base {
	private int width;
	private int height;

	Square() {
		this.name = "사각형";
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
		this.size = this.height * this.width;
	}
}
