package Champion;

public class Caitlyn extends Champion{
	Caitlyn(){
		this.name = "케이틀린";
	}
	public void champStat() {
		this.hp=80;
		this.attack = 21;
		this.defense = 7;
	}
	public void champskill() {
		this.skill = "비장의 한 발";
		this.skillEffect = 30;
	}
}
