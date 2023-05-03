package zNote;

public class Awq {
	public static int[] solution(int[] arr, int[] query) {
        int[] answer = new int[query.length];
        int count = arr.length;
        for(int i=0; i<query.length; i++) {
        	int[] a = new int[arr.length];
        	for(int j=query[i]; j<arr.length; j++) {
        		
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4, 5};
		int[] query = {4, 1, 2};
		System.out.println(solution(arr,query));
	}
}
