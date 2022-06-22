package Game;

public class characters{
    String name;
	int hp;
	int atk;
	
	public characters (String name,int hp, int atk) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}
	
	public void attacks (characters enemy) {
		System.out.println(this.name + "attacks!");
		enemy.hp -= this.atk;
		System.out.println(enemy.name + " HP : "+enemy.hp);
		System.out.println("---------------------------");
	}
	
	public boolean isLives() {
		if( hp <= 0) {
			return false;
		}else {
			return true;
		}
	}
}

