
public class FirstJw {
	public static void main(String[] args) {

		for (int i = 1; i < 100; i++) {

			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				System.out.println("박수");

			} else {
				System.out.println(i);
			}
		}
	}
}