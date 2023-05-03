import java.util.Scanner;

public class Store {
	String name;
	Customer[] customer = new Customer[100];
	int index = 0;
	int amSalesTotal = 0;
	int pmSalesTotal = 0;
	int salesTotal = 0;
	
	Store(String name){
		this.name = name;
	}
	
	public void showMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. 고객 정보 입력");
		System.out.println("2. 고객 목록 출력");
		System.out.println("3. 매출액 입력");
		System.out.println("4. 총 매출액 출력");
		System.out.println("5. 시간대 별 고객 순위 출력");
		String selectMenu = scanner.nextLine();
		if(selectMenu.equals("1")) {
			this.addCustomer();
		}else if(selectMenu.equals("2")) {
			this.printCustomer();
		}else if(selectMenu.equals("3")) {
			this.inputSales();
		}else if(selectMenu.equals("4")) {
			this.calcTotal();
		}else if(selectMenu.equals("5")) {
			this.printRank();
		}else {
			System.out.println("입력이 잘못되었습니다.");
			this.showMenu();
		}
	}
	
	
	public void addCustomer() {
		System.out.println("추가할 고객의 정보를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		System.out.println("성함 : ");
		String name = scanner.nextLine();
		System.out.println("성별 : ");
		String sex = scanner.nextLine();
		System.out.println("나이 : ");
		String strAge = scanner.nextLine();
		int age = Integer.parseInt(strAge);
		this.customer[this.index] = new Customer(name,sex,age);
		this.index++;
	}
	
	public void printCustomer() {
		for(int i=0; i<this.index; i++) {
			System.out.println(""+(i+1)+" : "+customer[i]);
		}
	}
	
	public void inputSales() {
		this.printCustomer();
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력을 원하는 고객 선택");
		String selectCustomer = scanner.nextLine();
		int selectCustomerNum = Integer.parseInt(selectCustomer);
		if(this.customer[selectCustomerNum-1]!=null) {
			this.customer[selectCustomerNum-1].showMenu();
		}
	}
	
	public void calcTotal() {
		this.salesTotal=0;
		for(int i=0; i<this.index; i++) {
			this.salesTotal = this.salesTotal + this.customer[i].sales[0].sale
					+this.customer[i].sales[1].sale;
		}
		System.out.println(this.salesTotal);
	}
	
	public void printRank() {
		for(int i=0; i<this.index-1; i++) {
			for(int j=0; j<this.index-(i+1); j++) {
				if(this.customer[i].sales[0].sale < this.customer[j].sales[0].sale) {
					Customer temp = this.customer[i];
					this.customer[i] = this.customer[j];
					this.customer[j] = temp;
				}
			}
		}
		this.printCustomer();
	}
	
	@Override
	public String toString() {
		return this.name + "("+this.index+"명)";
	}
	
}
