import java.util.Arrays;
import java.util.Scanner;

public class Student {
   String name;
   String address;
   String gender;
   int maleCount = 0;
   int femaleCount = 0;
   int addressCount1 = 0;
   int addressCount2 = 0;
   int addressCount3 = 0;
   int addressCount4 = 0;
   int addressCount5 = 0;
   int addressCount6 = 0;
   
   int sumKor =0;
   int sumEng =0;
   int sumMath =0;
   
   int sumMiddle =0;
   int sumLast =0;
   
   double avgKor =0;
   double avgEng =0;
   double avgMath =0;
   
   double avgMiddle =0;
   double avgLast =0;
   
   int sumTotal =0;
   double avgTotal =0;

   public void inputAddress(String[] addressArray) {
      System.out.println("주소를 번호로 입력하세요");
      Scanner scanner = new Scanner(System.in);
      String inputData = scanner.nextLine();
      int inputNumber = Integer.parseInt(inputData);
      int indexNumber = inputNumber - 1;
      if (Character.isDigit(inputData.charAt(0)) && (indexNumber < addressArray.length)) {

         this.address = addressArray[indexNumber];
      } else {
         System.out.println(addressArray.length + "이하의 숫자만 가능합니다.");
         inputAddress(addressArray);
      }
   }

   public void inputName() {
      System.out.println("이름을 입력하세요");
      Scanner scanner = new Scanner(System.in);
      String inputData = scanner.nextLine();
      this.name = inputData;
   }

   public void inputGender() {
      System.out.println("성별을 입력하세요.(남,여)");
      String[] gender = { "남", "여" };
      Scanner scanner = new Scanner(System.in);
      String inputData = scanner.nextLine();
      boolean check = false;
      for (int i = 0; i < gender.length; i++) {
         if (inputData.equals(gender[i])) {
            check = true;
         }
      }
      if (check) {
         this.gender = inputData;
      } else {
         System.out.println("다시 입력하세요");
         inputGender();
      }
      if (this.gender.equals("남")) {
         maleCount++;
      } else if (this.gender.equals("여")) {
         femaleCount++;
      }
   }

   public void inputStudentData() {
      this.inputName();
      this.selectAddress();
      this.inputGender();

   }

   public void print() {
      System.out.println("이름 : " + this.name + " 주소 : " + this.address + " 성별 : " + this.gender);
   }

   public void selectAddress() {
      String[] address = { "서울", "경기", "강원", "전라", "경상", "충청" };
      System.out.println("1. 서울 2. 경기 3. 강원 4. 전라 5. 경상 6. 충청");

      System.out.println("지역을 번호로 입력하세요");
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      int inputData = Integer.parseInt(input);
      boolean check = false;
      if (inputData < address.length) {
         this.address = address[inputData];
      } else
         System.out.println("1~6 숫자만 누르세요");
      if (inputData == 1) {
         addressCount1++;
      }else if(inputData == 2) {
         addressCount2++;
      }else if(inputData == 3) {
         addressCount3++;
      }else if(inputData == 4) {
         addressCount4++;
      }else if(inputData == 5) {
         addressCount5++;
      }else if(inputData == 6) {
         addressCount6++;
      }
   }
   
   public void inputTestResult() {
      //여기에 원진씨한테 받은 테스트 객체 넣을거임
      MiddleTest test = new MiddleTest();
      test.inputScore();
      this.sumKor = test.middleKor+test.lastKor;
      this.sumEng = test.middleEng+test.lastEng;
      this.sumMath = test.middleMath+test.lastMath;
      
      this.avgKor = this.sumKor/2;
      this.avgEng = this.sumEng/2;
      this.avgMath = this.sumMath/2;
      
      this.sumMiddle = test.middleEng+test.middleKor+test.middleMath;
      this.sumLast = test.lastEng+test.lastKor+test.lastMath;
      
      this.avgMiddle = this.sumMiddle/3;
      this.avgLast = this.sumLast/3;
      
      this.sumTotal =this.sumMiddle+this.sumLast;
      this.avgTotal =(this.avgLast+this.avgMiddle)/2;
   }
}