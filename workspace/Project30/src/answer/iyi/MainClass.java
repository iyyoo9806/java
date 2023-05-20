package answer.iyi;

import java.util.ArrayList;

public class MainClass {
public static void main(String[] args) {
	
	ArrayList<Student> student = new ArrayList<Student>();
	
	student.add(new Student("유",100));
	student.add(new Student("김",90));
	student.add(new Student("박",80));
	
	for(int i=0; i<student.size(); i++) {
		System.out.println(student.get(i).name + ":" + student.get(i).score);
	}
}
}
