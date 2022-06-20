package lottoP;

import java.util.Random;

public class Lotto_two {
    public static void main(String[] args) {
        int[] a = new int[7];
        Random r = new Random();

        for(int i = 0; i< 5; i++){
            int lottoNum = r.nextInt(6)+1;
            a[i] = lottoNum;
        }

        for(int i = 0; i<a.length; i++){
            if(i<6){
                System.out.println(a[i] + "/");
            }else {
                System.out.println("+"+a[i]);
            }
        }
        System.out.println();
    }
    
}
