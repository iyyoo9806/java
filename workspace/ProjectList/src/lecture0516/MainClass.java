package lecture0516;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		String[] s = { "a", "b", "c" };

//		for(int i=0; i<s.length; i++) {
//			System.out.println(s[i]);
//		}
		
//		for each 방식
		for(String item : s) {
			System.out.println(item);
		}
		
		
		
//		HashSet<String> t = new HashSet<String>();
//		t.add("1");
//		t.add("1");
//		t.add("2");
//		t.add("2");
//		t.add("3");
//		t.add("3");
//		// 중복되는거 안들어감
//		System.out.println(t);
//
//		HashMap<String, String> a = new HashMap<String, String>();
//		a.put("abc", "!");
//		a.put("t", "*");
//		System.out.println(a.get("t") + " " + a.get("abc"));

	}
}
