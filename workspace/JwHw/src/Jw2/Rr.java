package Jw2;
import java.util.*;
public class Rr {
public static void main(String[] args) {
	   Scanner s = new Scanner(System.in);
	   Random r = new Random();
//	   System.out.println("게임시작 : 가위[0] 바위[1] 보[2] 종료[e] 전적조회[r]");
//	   String input = s.nextLine();      
//	   int com = r.nextInt(3);
	   int winCount = 0;
	   int loseCount = 0;
	   int drawCount = 0;
	   
	   for (int i =0 ; i<99999999 ; i++) {
		   System.out.println("게임시작 : 가위[0] 바위[1] 보[2] 종료[e] 전적조회[r]");
		   String input = s.nextLine();      
		   int com = r.nextInt(3);
	   if (input.equals("0") || input.equals("1") || input.equals("2")) {
	      System.out.println("게임을 시작합니다.");
	      int user = Integer.parseInt(input);
	      
	      if( user ==0 ) {
	         System.out.println("사용자 : 가위");
	      }else if( user ==1 ) {
	         System.out.println("사용자 : 바위");
	      }else{
	         System.out.println("사용자 : 보");
	      }
	      
	      if( com == 0) {
	         System.out.println("컴퓨터 : 가위");
	      }else if( com == 1) {
	         System.out.println("컴퓨터 : 바위");
	      }else if( com ==2 ) {
	         System.out.println("컴퓨터 : 보");
	      } 
	      
	      if ((user ==0 && com ==2) || (user ==1 && com ==0) || (user ==2 && com == 1)) {
	         System.out.println("승리");
	         winCount =winCount+1;
	      }else if( user == com ) {               
	         System.out.println("무승부");
	         drawCount =drawCount+1;
	      }else {
	         System.out.println("패배");
	         loseCount =loseCount+1;
	      }
	      
	         
	   }else if (input.equals("e")) {
	      System.out.println("게임을 종료합니다.");
	   }else if (input.equals("r")) {
	      System.out.println("전적을 조회합니다.");
	      System.out.println("전적조회 : "+"승["+winCount+ "]패["+ loseCount+"]무["+drawCount+"]");

	   }
	   else {
	      System.out.println("잘못 입력하셨습니다." );
	   }
	   
	   
	   
	   
	   }   



}
}

