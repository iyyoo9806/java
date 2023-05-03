package Champion;

public class Leesin extends Champion{
	Leesin(){
		this.name = "리 신";
	}
	public void champStat() {
		this.hp=110;
		this.attack = 15;
		this.defense = 11;
	}
	public void champskill() {
		this.skill = "인섹킥";
		this.skillEffect = 18;
	}
}
