
import java.util.Arrays;

public class L4Quiz3 {
   public static void main(String[] args) {
      
      int arr [][] = {{10,33,44}, {27,5,98}};

      System.out.println("Name     Quiz1   Quiz2   Quiz3   Sum   Avg   ");   
      System.out.println("---------------------------------------");
      
      System.out.print("Student1");
      System.out.print(" ");
      
      for(int j=0; j<arr.length;j++) { // for문 통해서 배열 값 모두 출력
         int sum = 0;

         for(int i=0; i<arr.length+1; i++) { //배열 값 출력하기
         sum = arr[j][i] +sum; // 배열합구하기
         System.out.print(arr[j][i]);
         System.out.print("     ");
         }System.out.print(sum + "    "); 
         System.out.println(sum/(double)3); // 배열의 평균구하기
         System.out.print("Student2 ");
      }
      System.out.println("---------------------------------------");
      System.out.print("tot");
      System.out.print("     ");   

      for(int j=0; j<arr.length+1; j++) { // 배열의 합 구하기 
         int sum=0;
         for(int i =0; i<arr.length; i++) {
            sum = arr[i][j] +sum;
         }System.out.print(sum + "     ");   
      }
            
      
   }   
   
}
