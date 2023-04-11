import java.util.Scanner;

public class MiddleTest {
	   int middleKor=0;
	   int middleEng =0;
	   int middleMath =0;
	   int lastKor=0;
	   int lastEng =0;
	   int lastMath =0;
	   
	   public void inputScore() {
	      System.out.println("입력하실 시험을 선택해주세요.[1]중간 [2]기말");
	      Scanner scanner = new Scanner(System.in);
	      String asdf = scanner.nextLine();
	      if(asdf.equals("1")) {
	         System.out.println("중간고사의 국어 점수를 입력해주세요.");
	         this.middleKor = scanner.nextInt();
	         System.out.println("중간고사의 영어 점수를 입력해주세요.");
	         this.middleEng = scanner.nextInt();
	         System.out.println("중간고사의 수학 점수를 입력해주세요.");
	         this.middleMath = scanner.nextInt();
	      }else if(asdf.equals("2")) {
	         System.out.println("기말고사의 국어 점수를 입력해주세요.");
	         this.lastKor = scanner.nextInt();
	         System.out.println("기말고사의 영어 점수를 입력해주세요.");
	         this.lastEng = scanner.nextInt();
	         System.out.println("기말고사의 수학 점수를 입력해주세요.");
	         this.lastMath = scanner.nextInt();
	      }else {
	         System.out.println("오입력");
	      }
	   }
	}