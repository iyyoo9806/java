
public class Switch {
public static void main(String[] args) {
	int a = 0;
	
	switch(a) {
	case 0:
		System.out.println("11111");
	case 1:
		System.out.println("33333");
		break;
	default:
		System.out.println("ooooooo");
	}
	
	if (a==0) {
		System.out.println("11111");
	}else if (a==1) {
		System.out.println("33333");
	} else {
		System.out.println("ooooooo");
	}
}
}
