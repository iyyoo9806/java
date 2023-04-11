import java.util.Arrays;

public class L4second {
public static void main(String[] args) {
	
	int[][] org = {{1,2},{3,4}};
	int[][] tar = new int[2][2];
	
	for(int i=0; i<org.length; i++) {
		for(int j=0; j<org[i].length; j++) {
			tar[i][j] = org[i][j];
		}
	}	System.out.println(Arrays.deepToString(tar));
	
	
	
	int[][] tar2 = new int[2][2];
	System.arraycopy(org, 0, tar2, 0,org[0].length);
	System.out.println("-------------");
	System.out.println(Arrays.deepToString(tar2));
}
}
