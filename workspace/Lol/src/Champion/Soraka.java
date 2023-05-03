package Champion;

public class Soraka extends Champion{
	Soraka(){
		this.name = "소라카";
	}
	public void champStat() {
		this.hp=100;
		this.attack = 8;
		this.defense = 15;
	}
	public void champskill() {
		this.skill = "별부름";
		this.skillEffect = 28;
	}
}
