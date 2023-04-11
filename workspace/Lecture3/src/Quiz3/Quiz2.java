package Quiz3;

public class Quiz2 {
	public static void main(String[] args) {
		System.out.println(plus(200));
	}

	public static int plus(int i) {
		if (i < 100 || i > 201) {
			return 0;
		} else
			return i + plus(i - 1);

	}
}
