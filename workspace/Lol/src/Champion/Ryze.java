package Champion;

public class Ryze extends Champion{
	Ryze(){
		this.name = "라이즈";
	}
	public void champStat() {
		this.hp=110;
		this.attack = 17;
		this.defense = 9;
	}
	public void champskill() {
		this.skill = "마나중독";
		this.skillEffect = 23;
	}
}
