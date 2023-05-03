public class Garen extends Champion {
	Garen(){
		this.name = "가렌";
	}
	public void champStat() {
		this.hp=150;
		this.attack = 10;
		this.defense = 15;
	}
	public void champskill() {
		this.skill = "대마시아의 정의";
		this.skillEffect = 20;
	}
}
