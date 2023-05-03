import java.util.Random;

public class Base {
   int hp;
   int power;
   String name;
   int escapeRate;
   int criticalRate;
   boolean live = true;

   Base() {
      this.hp = 100;
      this.name = "기본";
   }

   public void underAttack(int ATK) {
      Random random = new Random();
      int escape = random.nextInt(100) + 1;
      int critical = random.nextInt(100) + 1;
      if (escape > this.escapeRate) {
         System.out.println("회피");
         return;
      }
      if (critical > this.criticalRate) {
         this.hp = this.hp - (ATK) * 2;
      } else {
         this.hp = this.hp - ATK;
      }
   }

   public boolean isLive() {
      if (this.hp < 1) {
         return this.live = false;
      }
      return this.live = true;
   }

   public void gaming(int ATK) {
      this.underAttack(ATK);
      this.isLive();

   }

   @Override
   public String toString() {
      if (this.live) {
         return this.name + " (hp : " + this.hp + ")";
      } else {
         return this.name + " 의 맷집은 여기까지 입니다.";
      }
   }

   public void printResult() {
      if (this.live) {
         System.out.print(this.name + "는 살아있습니다.  ");
         System.out.println(this.name + " (hp : " + this.hp + ")");
      } else {
         System.out.println(this.name + "의 이번 대회는 여기까지입니다.");
      }
   }
}