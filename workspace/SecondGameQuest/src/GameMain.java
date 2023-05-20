import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameMain {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();
//    Base[] champion = new Base[6];
      ArrayList<Base> champion = new ArrayList<Base>();
      ArrayList<String> rank = new ArrayList<String>();
      String winner = "";
      System.out.println("게임을 시작하겠습니까?(y/n)");
      String inputString = scanner.nextLine();
      if (inputString.equals("y")) {
         System.out.println("게임이 시작되었습니다.");
         System.out.println("천하제일맷집대회");
         champion.add(new Archer());
         champion.add(new Warrior());
         champion.add(new Wizard());
         champion.add(new Breserker());
         champion.add(new Masochist());
         champion.add(new Druger());
         int count = 0;
         // 순서정하기
         for (int i = 0; i < champion.size(); i++) {
            int randIndex = random.nextInt(champion.size());
            Base temp = champion.get(i);
            champion.set(i, champion.get(randIndex));
            champion.set(randIndex, temp);
         }
         System.out.println("순서 : ");
         for (int i = 0; i < champion.size(); i++) {            
            System.out.println(i+1+"번"+champion.get(i).name);
         }

         for (int i = 0; i < 99999; i++) {
            if (count == 5) {
               for (int j = 0; j < champion.size(); j++) {
                  if (champion.get(j) != null) {
                     winner = champion.get(j).name;

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
               for (int j = 0; j < champion.size(); j++) {
                  if (champion.get(j) != null) {
                     if (champion.get(j).live == false) {
                        rank.add(champion.get(j).name);
                        champion.set(j, null);
                        count = count + 1;
                        continue;
                     }
                  }
                  
                  if (champion.get(j) != null&&count!=5) {
                     System.out.println(champion.get(j).name + "가 맞을 차례입니다.");

                     for (int k = 0; k < champion.size(); k++) {
                        if (j != k && champion.get(k) != null && champion.get(j) != null &&champion.get(k).live) {
                           System.out.println(champion.get(k).name + "가 공격합니다.");
                           champion.get(j).gaming(champion.get(k).power);
                        }
                     }
                     
                     System.out.println(champion.get(j));
                     System.out.println("-------------------------");
                  }
               }
               for (int k = 0; k < champion.size(); k++) {
                  if (champion.get(k) == null) {
                     continue;
                  } else {
                	  champion.get(k).printResult();

                  }

               }

            }
         }
         

      } else if (inputString.equals("n")) {
         System.out.println("종료되었습니다.");
      }

   }
}
