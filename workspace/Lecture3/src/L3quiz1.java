
public class L3quiz1 {
	public static void main(String[] args) {
		String name[] = { "A", "B", "C", "D", "E" };
		int kor[] = { 50, 60, 70, 80, 90 };
		int eng[] = { 10, 70, 80, 90, 100 };
		int math[] = { 95, 80, 90, 85, 80 };
		int point[] = new int[name.length];
		int tmp = 0;
		String tmp2;
		for (int i = 0; i < name.length; i++) {
			point[i] = kor[i] + eng[i] + math[i];
		}

		for (int i = 0; i < name.length - 1; i++) {
			for (int j = 0; j < name.length - (i + 1); j++) {
				if (point[j] < point[j + 1]) {
					tmp = point[j];
					point[j] = point[j + 1];
					point[j + 1] = tmp;
					tmp2 = name[j];
					name[j] = name[j+1];
					name[j+1] = tmp2;
					
				}
			}
		}
		
		
		
		
		for (int i = 0; i < name.length; i++) {
			System.out.println(point[i]+name[i]);
		}
	}
}
