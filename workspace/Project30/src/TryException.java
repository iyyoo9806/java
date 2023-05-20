import java.util.Scanner;

public class TryException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input Number : ");

		// 1 try catch
		try {
			String inpuString = scanner.nextLine();
			int a = Integer.parseInt(inpuString);
			System.out.println(10 / a);
		}catch (NullPointerException e) {
			System.out.println("Null Error");
		} catch (NumberFormatException e) {
			System.out.println("Number Error");
		} catch (Exception e) {
			System.out.println("Error");
//			e.printStackTrace(); // 오류정보 출력
		} finally {
			System.out.println("정상실행");
		}
	}
}
