import java.util.Scanner;

import java.util.Scanner;

public class Group {
String groupName="";
public void namingGroup() {
   Scanner scanner = new Scanner(System.in);
   groupName = scanner.nextLine();   
}
public void inputStudent() {
   int maxStudent =100;
   Student[] student = new Student[maxStudent];
   Scanner scanner = new Scanner(System.in);
   int studentCount =0;
   for (int i = 0; i < 9999; i++) {
      System.out.println("인원을 추가하시겠습니까");
      System.out.println("1.추가 2.다음단계(조회)");
      String menu = scanner.nextLine();
      if (menu.equals("1")) {
         if (studentCount < student.length) {
            student[studentCount] = new Student();
            System.out.println("학생인적사항 입력");
            student[studentCount].inputStudentData();
            System.out.println("학생성적 입력");
            student[studentCount].inputTestResult();
            studentCount++;
         } else {
            System.out.println("인원을 추가할수 없습니다. 최대 인원수는 " + student.length + "입니다.");
            break;
         }
      } else if (menu.equals("2")) {
         break;
      } else {
         System.out.println("1,2 만 누르세요");
      }
   }
}
}