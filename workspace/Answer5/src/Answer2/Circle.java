package Answer2;
import java.util.Random;

public class Circle extends Base {
	private int half;

	Circle() {
		this.name = "원";
	}

	@Override
	protected void randomNumber() {
		Random random = new Random();
		this.half = random.nextInt(100);
	}

	@Override
	protected void calSize() {
		this.size = this.half * this.half * Math.PI;
		this.size = Math.round(this.size*100)/(double)100;
	}
}
