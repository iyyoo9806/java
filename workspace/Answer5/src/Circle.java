import java.util.Scanner;

public class Circle extends Base {
	private double half;

	Circle() {
//		super();
		this.name = "원";
	}

	@Override
	protected void inputNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("half : ");
		String inputString = scanner.nextLine();
		inputString = scanner.nextLine();
		this.half = Double.parseDouble(inputString);
	}

	@Override
	protected void calSize() {
		this.size = this.half * this.half * Math.PI;
	}

//	public void test() {
//		super.printSize();
//		this.printSize();
//	}

	@Override
	protected void printSize() {
		super.printSize();
		System.out.println("나는 원이야");
	}
}
