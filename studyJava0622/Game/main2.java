package Game;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
		
		int cnt = 0;
		dalplayer player = new dalplayer("dal",7000,66);
		soplayer player2 = new soplayer("so",6000,77);
		Scanner sc = new Scanner(System.in);
		
		while(player.isLives() && player2.isLives()) {
			player2.attacks(player);
			cnt++;
			if(cnt==3) {
				player2.Heals();
				cnt=0;
			}
			if(!player.isLives()) break;
			player.attacks(player2);;
			if(!player2.isLives())break;
		}
		
		if(player.isLives()) {
			System.out.println("달이 이겼다잉.");
		}else {
			System.out.println("소가 이겼다잉.");			
		}
		
	}
}
    

