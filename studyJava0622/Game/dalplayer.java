package Game;

public class dalplayer extends characters {
	
	public dalplayer(String name,int hp, int atk) {
		super(name,hp,atk);
	}
	
	int hp2 = (int)(hp*0.3);

	@Override
	public void attacks (characters enemy) {
		
		if ( hp <= hp2) {
			System.out.println("달이가 미쳐 날뛴다잉");
			atk = (int)(atk*1.05);
			System.out.println(this.name+"atk : "+this.atk);
		}
		super.attacks(enemy);
	}
}
