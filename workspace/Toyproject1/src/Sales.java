import java.util.Scanner;

public class Sales {
	String name;
	int sale;
	
	Sales(String name){
		this.name = name;
	}
	
	public void inputSales() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("계산액 : ");
		String inputSales = scanner.nextLine();
		this.sale = Integer.parseInt(inputSales);
	}
}
