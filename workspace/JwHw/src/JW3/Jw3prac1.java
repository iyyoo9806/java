package JW3;

import java.util.Arrays;

public class Jw3prac1 {
public static void main(String[] args) {
	String[] listA = {"!$#^1!%#@", "#$@!^2!#$^", "!$#^3", "4!$#^", "!#$^5"};
    String senTense = Arrays.toString(listA);
    System.out.println("listA : " + senTense);
    String[] listB = senTense.split(",");
    for(int i = 0; i < listB.length; i++) {
        listB[i] = listB[i].replace("[", "");	//"[" 표시는 replace로만 삭제가능
        listB[i] = listB[i].replace("]", "");	//"]" 표시는 replace로만 삭제가능
        listB[i] = listB[i].replace(" ", "");	//" "(띄어쓰기) 표시는 replace로만 삭제가능
        listB[i] = listB[i].replaceAll("[!@#$%^&*(),]", "");
        
    }
    for(int i = 0; i < listB.length; i++) {
        System.out.println("인덱스 " + i + "번째의 값은 " + listB[i] + "입니다.");
    }

	
}
}
