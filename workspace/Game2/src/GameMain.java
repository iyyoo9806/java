import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameMain {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();
      Base[] champion = new Base[6];
      ArrayList<String> rank = new ArrayList<String>();
      String winner = "";
      System.out.println("게임을 시작하겠습니까?(y/n)");
      String inputString = scanner.nextLine();
      if (inputString.equals("y")) {
         System.out.println("게임이 시작되었습니다.");
         System.out.println("천하제일맷집대회");
         champion[0] = new Archer();
         champion[1] = new Warrior();
         champion[2] = new Wizard();
         champion[3] = new Breserker();
         champion[4] = new Masochist();
         champion[5] = new Druger();
         int count = 0;
         // 순서정하기
         for (int i = 0; i < champion.length; i++) {
            int randIndex = random.nextInt(champion.length);
            Base temp = new Base();
            temp = champion[i];
            champion[i] = champion[randIndex];
            champion[randIndex] = temp;
         }
         System.out.println("순서 : ");
         for (int i = 0; i < champion.length; i++) {            
            System.out.println(i+1+"번"+champion[i]);
         }

         for (int i = 0; i < 99999; i++) {
            if (count == 5) {
               for (int j = 0; j < champion.length; j++) {
                  if (champion[j] != null) {
                     winner = champion[j].name;

                  }
               }
               System.out.println("맷집순위 입니다. 1등 : " + winner + " 2등 : " + rank.get(4) + " 3등 : " + rank.get(3) + " 4등 : "
                     + rank.get(2) + " 5등 : " + rank.get(1) + " 6등 : " + rank.get(0));
               break;
            }
            else if(count ==6) {
               System.out.println("맷집순위 입니다. 1등 : " + rank.get(5) + " 2등 : " + rank.get(4) + " 3등 : " + rank.get(3) + " 4등 : "
                     + rank.get(2) + " 5등 : " + rank.get(1) + " 6등 : " + rank.get(0));
               break;
            }

            else {
               System.out.println((i + 1) + "번째 결투가 시작됩니다. enter를 누르세요");
               String stopString = scanner.nextLine();// 게임 진행 가독성을 위해 넣음
               for (int j = 0; j < champion.length; j++) {
                  if (champion[j] != null) {
                     if (champion[j].live == false) {
                        rank.add(champion[j].name);
                        champion[j] = null;
                        count = count + 1;
                        continue;
                     }
                  }
                  
                  if (champion[j] != null&&count!=5) {
                     System.out.println(champion[j].name + "가 맞을 차례입니다.");

                     for (int k = 0; k < champion.length; k++) {
                        if (j != k && champion[k] != null && champion[j] != null &&champion[k].live) {
                           System.out.println(champion[k].name + "가 공격합니다.");
                           champion[j].gaming(champion[k].power);
                        }
                     }
                     
                     System.out.println(champion[j]);
                     System.out.println("-------------------------");
                  }
               }
               for (int k = 0; k < champion.length; k++) {
                  if (champion[k] == null) {
                     continue;
                  } else {
                     champion[k].printResult();

                  }

               }

            }
         }
         

      } else if (inputString.equals("n")) {
         System.out.println("종료되었습니다.");
      }

   }
}
