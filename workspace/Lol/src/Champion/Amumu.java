package Champion;

public class Amumu extends Champion{
	Amumu(){
		this.name = "아무무";
	}
	public void champStat() {
		this.hp=140;
		this.attack = 9;
		this.defense = 16;
	}
	public void champskill() {
		this.skill = "미라의 저주";
		this.skillEffect = 15;
	}
}
