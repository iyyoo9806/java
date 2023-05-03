package Champion;

public class Sona extends Champion{
	Sona(){
		this.name = "소나";
	}
	public void champStat() {
		this.hp=110;
		this.attack = 7;
		this.defense = 13;
	}
	public void champskill() {
		this.skill = "크레센도";
		this.skillEffect = 29;
	}
}
