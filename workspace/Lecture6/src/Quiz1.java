public class Quiz1 {
	public int logic(int start, int n) {
		int[] a = new int[n];
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			if(i==0) {
				a[i] = start;
			}else {
				a[i] = a[i-1]+1;
			}
		}
		for(int i=0; i<a.length; i++) {
			sum = sum+a[i];
		}
		
		return sum ;
	}
}
