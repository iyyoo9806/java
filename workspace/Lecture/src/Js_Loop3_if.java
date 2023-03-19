
public class Js_Loop3_if {

	public static void main(String[] args) {
		int a = 10;
		
		if(a == 10) {
			System.out.println(" a == 10 ");
			
		if(a>10) {
			System.out.println("a>10");
		} else {
			System.out.println("a<=10");
		}
		
		if (a < 5) {
			System.out.println("a<5");
		} else if(a >= 5) {
			System.out.println("a>=5");
		} else {
			System.out.println("else");
		}
		
		for(int i =0; i<100; i++) {
			System.out.println(" 2 * " + i + "=" + (2*1));
		  if(i <=9) {
			System.out.println(" 2 * " + i + "=" + (2*1));
		// -> if(i > 9) {
		//	break;
		//}
		// System.out.println(" 2 * " + i " = " + (2*1));
		}
	}
}
	}
}

