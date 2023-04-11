
public class M1 {
public static void main(String[] args) {
	SumMachine sumMachine = new SumMachine();
	
	sumMachine.makeSum(1, 10);
	int result = sumMachine.makeSum(1, 100);
	System.out.println(result);
}
}
