package Jw2;

import java.util.Scanner;

public class Jwprac1 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("숫자입력 :"+" ");
	int inputInt = s.nextInt();
	
	if(inputInt>=21) {
		System.out.println("ERROR");
	}else if(inputInt<21) {
		for(int i = inputInt; i<21; i++ ) {
			System.out.println("7 x " + i +"="+ 7*i);
	}
		
}
}
}