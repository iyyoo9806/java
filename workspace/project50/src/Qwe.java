import java.util.Scanner;

public class Qwe {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int inputInt = scanner.nextInt();
	for(int i=1; i<=9; i++) {
		System.out.println(i*inputInt);
	}
}
}