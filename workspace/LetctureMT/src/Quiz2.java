
public class Quiz2 {
	public static void main(String[] args) {
		int N = 3;
		String a = "*CDA";
		String b = "**AA";
		String c = "ABCD";
		String[] a1 = a.split("");
		String[] b1 = b.split("");
		String[] c1 = c.split("");
		int answerA = 0;
		int answerB = 0;
		int answerC = 0;
		for (int i = 0; i < a1.length; i++) {
			if (a1[i].equals("A")) {
				answerA++;
			}
		}
		for (int i = 0; i < b1.length; i++) {
			if (b1[i].equals("A")) {
				answerB++;
			}
		}
		for (int i = 0; i < c1.length; i++) {
			if (c1[i].equals("A")) {
				answerC++;
			}
		}
		System.out.println(answerA);
		System.out.println(answerB);
		System.out.println(answerC);
	}
}
