
public class MainClass {
	public static void main(String[] args) {
//		Triangle s1 = new Triangle();
//		s1.doAction();
//		
//		Square s2 = new Square();
//		s2.doAction();
//		
//		Circle s3 = new Circle();
//		s3.doAction();
		
		Base s1 = new Triangle();
		s1.doAction();
		
		Base s2 = new Square();
		s2.doAction();
		
		Base s3 = new Circle();
		s3.doAction();
		
		Base[]b = new Base[3];
		b[0] = new Triangle();
		b[0].doAction();
		
		b[1] = new Square();
		b[1].doAction();
		
		b[2] = new Circle();
		b[2].doAction();
	}
}
