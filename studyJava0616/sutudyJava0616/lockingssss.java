package sutudyJava0616;

import java.util.*;

public class lockingssss {
    
    public static void main(String[] args){
        int[][] key = { { 0, 0, 0 }, { 1, 0, 0 }, { 0, 1, 1 } };
        int[][] lock = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };


        System.out.println(solution(key, lock));

    }

    private static boolean solution(int[][] key, int[][] lock) {
        boolean answer = true;
        int keyX = key.length;
        int lockY = lock.length;
        int[][] locking = new int[lockY*3][lockY*3];

            //자물쇠 3x3으로 만든다.
            for(int i = 0; i<lockY; i++){
                for(int j=0; j<lockY; j++){
                    locking[lockY+i][lockY+j] = lock[i][j];
                }
            }

            for(int j =0; j<locking.length; j++){
                System.out.println(Arrays.toString(locking));
            }
            

            //key값에 = typoon(key)메소드를 넣는다.
            for(int k = 0; k<4; k++){
                key = typoon(key);
            }
            System.out.println(key);


        return answer;
    }


            //열쇠 회전, 열쇠를 돌려줘야 되니까. tone에 key을 넣어준다.
            public static int[][] typoon(int[][] key){
                int[][] tone = new int[key.length] [key[0].length];
                    for(int i=0; i<tone.length; i++){
                        for(int j =0; j<tone.length; j++){
                    //열쇠가 돌아가면서 x축은 그대로 y축으로 도니까. -1-j를 넣음
                            tone[i][j] = key[key.length-1-j][i];
                        }
                    }
                    return tone;
                }
}
