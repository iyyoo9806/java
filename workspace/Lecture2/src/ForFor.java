
public class ForFor {
	public static void main(String[] args) {

		for (int i = 2; i < 10; i++) {
				System.out.println("구구단 " + i +"단 입니다.");
			for (int n = 1; n < 10; n++) {
				System.out.println(i + "x" + n + " = " + (i * n));
			}
		}
	}
}
