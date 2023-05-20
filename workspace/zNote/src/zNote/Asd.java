package zNote;

import java.util.Arrays;

public class Asd {
	public static void main(String[] args) {
		String[] park = { "OSO", "OOO", "OXO", "OOO" };
		String[] routes = { "E 2", "S 3", "W 1" };
		int y = park.length;
		int x = park[0].length();
		String[][] arr = new String[y][x];
		int startY = 0;
		int startX = 0;

		for (int i = 0; i < y; i++) {
			String[] str = park[i].split("");
			for (int j = 0; j < x; j++) {
				arr[i][j] = str[j];
				if (arr[i][j].equals("S")) {
					startY = i;
					startX = j;
				}
			}
		}
		System.out.println(startY + "," + startX);
//		String test = "E 2";
//		String[] test2 = new String[1];
//		String a ="";
//		int b = 0;
//		a = test.replace(" ", "").replaceAll("[0-9]","");
//		b = Integer.parseInt(test.replace(" ", "").replaceAll("[A-Z]", ""));

		String[] direction = new String[routes.length];
		int[] go = new int[routes.length];
		for (int i = 0; i < routes.length; i++) {
			direction[i] = routes[i].replace(" ", "").replaceAll("[0-9]", "");
			go[i] = Integer.parseInt(routes[i].replace(" ", "").replaceAll("[A-Z]", ""));
		}
		System.out.println(Arrays.toString(direction));
		System.out.println(Arrays.toString(go));
		int endY = startY;
		int endX = startX;

		for (int i = 0; i < routes.length; i++) {

			if (direction[i].equals("N")) {
				if (endY - go[i] < 0) {
					continue;
				} else {
//					arr[endY - go[i]][endX].equals("X")
//					int j = endY; j < y; j++
					for (int j = endY; j < go[i]; j++) {
						if (arr[j][endX].equals("X")) {
							continue;
						} else {
							endY = endY - go[i];
						}
					}
				}
			}

			if (direction[i].equals("S")) {
				if (endY + go[i] >= y) {
					continue;
				} else {
					for (int j = endY; j < go[i]; j++) {
						if (arr[j][endX].equals("X")) {
							continue;
						} else {
							endY = endY + go[i];
						}
					}
				}
			}

			if (direction[i].equals("W")) {
				if (endX - go[i] < 0) {
					continue;
				} else {
					if (arr[endY][endX - go[i]].equals("X")) {
						continue;
					} else {
						endX = endX - go[i];
					}
				}
			}

			if (direction[i].equals("E")) {
				if (endX + go[i] >= x) {
					continue;
				} else {
					if (arr[endY][endX + go[i]].equals("X")) {
						continue;
					} else {
						endX = endX + go[i];
					}
				}
			}

		}
		System.out.println(endY + "," + endX);
	}
}
