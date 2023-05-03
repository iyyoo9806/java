package Champion;

public class TwistedFate extends Champion{
	TwistedFate(){
		this.name = "트위스티드 페이트";
	}
	public void champStat() {
		this.hp=115;
		this.attack = 15;
		this.defense = 10;
	}
	public void champskill() {
		this.skill = "와일드 카드";
		this.skillEffect = 20;
	}
}
