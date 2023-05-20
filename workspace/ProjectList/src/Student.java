
public class Student {
	String name;
	int score;
	
	Student(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "이름 : "+this.name + " 점수 : "+this.score;
	}
}
