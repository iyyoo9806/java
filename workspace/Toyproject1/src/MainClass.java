import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Store[] store = { new Store("A상점"), new Store("B상점"), new Store("C상점") };
		
		for (int i = 0; i < 99999; i++) {
			System.out.println("---상점목록---");
			for(int j=0; j<store.length; j++) {
				System.out.println("" +(j+1)+ " : " +store[j]);
			}
			System.out.println("입력할 상점 번호 입력");
			System.out.println("종료 : q");
			Scanner scanner = new Scanner(System.in);
			String selectStore = scanner.nextLine();
			if(selectStore.equals("q")) {
				System.out.println("종료되었습니다.");
				break;
			}
			int selectStoreNum = Integer.parseInt(selectStore);
			store[selectStoreNum-1].showMenu();
			System.out.println("---");
			System.out.println("---");
		}
	}
}
