
public class Combination {
	public static void combination(char[]arr, int pick, int startdx, char[] output, int numElem) {
		if(numElem == pick) {
			System.out.println(output);
			return;
		}
		for(int i = startdx; i<arr.length; i++) {
			output[numElem++] = arr[i];
			combination(arr,pick,++startdx,output,numElem);
			--numElem;
		}
	}
	public static void main(String[] args) {
		char[] arr = {'A','B','C'};
		int pick = 2;
		int startdx = 0;
		char[] output = new char[pick];
		int numElem = 0;
		combination(arr,pick,startdx,output,numElem);
	}
}
