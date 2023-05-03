package Answer2;
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
		this.width = random.nextInt(100);
		this.height = random.nextInt(100);
	}

	@Override
	protected void calSize() {
		this.size = this.height * this.width / (double) 2;
	}
//	public void test1() {
//		
//	}
}
