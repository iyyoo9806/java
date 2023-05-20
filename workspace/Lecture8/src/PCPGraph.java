
public class PCPGraph {
	public static void gP(char[] arr, int size, char[] branch, int level, boolean[] visited) {

		if (level >= size - 1) {
			System.out.println(branch);
			return;
		}

		for (int i = 0; i < size; i++) {
			if (!visited[i]) {
				branch[++level] = arr[i];
				visited[i] = true;
				gP(arr, size, branch, level, visited);
				visited[i] = false;
				level--;
			}
		}
	}

	public static void main(String[] args) {
		char[] arr = { 'A', 'B', 'C' };
		int size = arr.length;
		char[] branch = new char[size];
		int level = -1;
		boolean[] visited = new boolean[size];
		gP(arr, size, branch, level, visited);

	}
}
