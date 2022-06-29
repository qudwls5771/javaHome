public class main {
    public static void main(String[] args){
        Waepon waepon = new Waepon();
        Lance lance = new Lance();
        Sword sword = new Sword();
        Player player = new Player();

        player.getAction(lance);
        player.getAction(sword);


    }
    
}
