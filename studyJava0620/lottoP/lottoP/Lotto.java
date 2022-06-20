package lottoP;
import java.util.Random;

public class Lotto {
    public static void main(String[] args){
        int [] lotto = new int[45];

        Random r = new Random();


        for(int i=0; i<6; i++){
            int lottos = r.nextInt(45) +1;
            if(lotto[lottos] !=0){
                i--;
            }else {
                //뽑힌 번호 1로 체크
                lotto[lottos] = 1;
            }
        }
        for(int i =0; i<lotto.length; i++){
            if(lotto[i] != 0){
                System.out.print("/"+i);
            }
        }

    }
    
}
