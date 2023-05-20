import java.util.ArrayList;
import java.util.Scanner;

public class Info {
	String name;
	int point;
//	Person[] person = new Person[100];
	ArrayList<Person> person = new ArrayList<Person>();

	public void addInfo() throws Exception{
//		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("추가할 이름을 입력해 주세요.");
			String name = scanner.nextLine();
			System.out.println("점수를 입력해 주세요.");
			String strPoint = scanner.nextLine();
			int point = Integer.parseInt(strPoint);
//			this.person[this.index] = new Person(name, point);
			person.add(new Person(name, point));
//		} catch (NumberFormatException e) {
//			// TODO Auto-generated catch block
//			System.out.println("점수에는 숫자를 입력해야합니다.");
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
	}

	public void printInfo() {
		for (int i = 0; i < person.size(); i++) {
			System.out.println("이름 : " + person.get(i).name + " 점수 : " + person.get(i).point);
		}
	}

	public void rank() {
		for (int i = 0; i < person.size()-1; i++) {
			for (int j = 0; j < person.size()-(i+1); j++) {
				if (person.get(j).point < person.get(j+1).point) {
					Person temp = person.get(j);
					person.set(j, person.get(j+1));
					person.set(j+1, temp);
				}
			}
		}
		this.printInfo();
	}
}
