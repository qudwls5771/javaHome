package Game;

public class soplayer extends characters {
	
	public soplayer(String name,int hp, int atk) {
		super(name,hp,atk);
	}
	

	public void Heals() {
		System.out.println("소애가 힐한다잉");
		hp += 50;
	}
}
