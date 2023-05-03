package Quiz;
import java.util.Random;

public class Circle extends Base {
	private int half;

	Circle() {
		this.name = "원";
	}

	@Override
	protected void randomNumber() {
		Random random = new Random();
		this.half = random.nextInt(10)+1;
		System.out.println("height : " +this.half );
	}

	@Override
	protected void calSize() {
		this.size = Math.abs(this.half * this.half * Math.PI);
	}
}
