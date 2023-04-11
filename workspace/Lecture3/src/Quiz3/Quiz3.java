package Quiz3;

public class Quiz3 {
	public static void main(String[] args) {
		System.out.println(fibo(10));
	}
	public static int fibo(int i) {
		if(i==1||i==2) {
			return 1;
		}else {
			return fibo(i-2)+fibo(i-1);
		}
		
	}
}
