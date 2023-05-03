import java.util.Scanner;

public class Customer {
	String name;
	String sex;
	int age;
	Sales[] sales = {new Sales("오전"),new Sales("오후")};
	
	Customer(String name, String sex, int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	public void showMenu() {
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<this.sales.length; i++) {
			System.out.println(""+(i+1)+" : "+this.sales[i].name);
		}
		System.out.println("원하시는 시간대를 선택해주세요.");
		String selectTime = scanner.nextLine();
		int selectTimeNum = Integer.parseInt(selectTime);
		this.sales[selectTimeNum-1].inputSales();
	}
	
	@Override
	public String toString() {
		return this.name + " (" + this.sex + ", " + this.age + ")";
	}
	
	
}
