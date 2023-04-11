package Quiz3;

public class Quiz1 {
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

	public static int factorial(int i) {
		if (i <= 1) {
			return i;
		} else
			return i * factorial(i - 1);

	}
}
