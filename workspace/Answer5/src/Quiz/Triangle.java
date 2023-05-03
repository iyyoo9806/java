package Quiz;
import java.util.Random;

public class Triangle extends Base {
	private int width;
	private int height;

	Triangle() {
		this.name = "삼각형";
	}

	@Override
	protected void randomNumber() {
		Random random = new Random();
		int inputInt = random.nextInt(10)+1;
		this.width = inputInt;
		System.out.println("height : " +this.width );
		
		inputInt = random.nextInt(10)+1;
		this.height = inputInt;
		System.out.println("height : " +this.height );
	}

	@Override
	protected void calSize() {
		this.size = this.height * this.width / (double) 2;
	}
}
