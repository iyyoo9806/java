public class Champion {
	String name;
	int hp;
	int attack;
	int defense;
	String skill;
	int skillEffect;
	Champion(){
		this.name = "챔피언";
	}
	public void champStat(){
		this.hp=100;
		this.attack = 10;
		this.defense = 8;
	}
	public void champskill() {
		this.skill = "스킬";
		this.skillEffect = 10;
	}
}
