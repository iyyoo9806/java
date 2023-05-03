package Champion;

public class Ezreal extends Champion{
	Ezreal(){
		this.name = "이즈리얼";
	}
	public void champStat() {
		this.hp=90;
		this.attack = 20;
		this.defense = 8;
	}
	public void champskill() {
		this.skill = "정조준 일격";
		this.skillEffect = 27;
	}
}
