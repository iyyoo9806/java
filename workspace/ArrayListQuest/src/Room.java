import java.util.ArrayList;
import java.util.Scanner;

public class Room {
	String name;
	int total;
	ArrayList<Student> student = new ArrayList<Student>();

	Room() {
		this.inputData();
	}

	Room(String name) {
		this.name = name;
	}

	public void inputData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("name : ");
		String tmp = scanner.nextLine();
		this.name = tmp;
	}

	public void inputStudent(Student s) {
		student.add(s);
	}

	public void printStudent() {
		for (int i = 0; i < student.size(); i++) {
			System.out.println(this.student.get(i).name);
		}
	}

	public void totalScore() {
		for (int i = 0; i < student.size(); i++) {
			this.total = this.total + this.student.get(i).score;
		}
		System.out.println("총점 : " + this.total);
	}

	@Override
	public String toString() {
		return this.name + " / 총 인원 : " + this.student.size();
	}
}
