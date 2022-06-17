package sutudyJava0616;

import java.util.*;



public class lockingssss {
    
    public static void main(String[] args){
        int[][] key = { { 0, 0, 0 }, { 1, 0, 0 }, { 0, 1, 1 } };
        int[][] lock = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };


        System.out.println(solution(key, lock));

    }

    public static boolean solution(int[][] key, int[][] lock) {
        
        int keyX = key.length;
        int lockY = lock.length; 

            for(int i=0; i<key.length; i++){
                System.out.println("열쇠" + Arrays.deepToString(key));
            }
            for(int j=0; j<key.length; j++){
                System.out.println("자물쇠" + Arrays.deepToString(lock));
                
            }
            
            //key값에 = typoon(key)메소드를 넣는다.
            for(int k = 0; k<4; k++){
                key = typoon(key);
            }




                //자물쇠 위치를 찾는다? 맞나?
            for(int i =0; i<lockY; i++){
                for(int j =0; j<lockY; j++){
                    //열쇠 + 자물쇠 돌린다?
                    for(int o = 0; o < keyX; o++){
                        for(int p = 0; p <keyX-3; p++){
                            lock[i+o][j+p] += key[i][j];
                        }
                    }
                    
                    if(ok(lock)){
                        return true;
                    }
                    System.out.println("자물쇠"+ok(lock));
                }
            }
               
            System.out.println("키 값:"+Arrays.deepToString(key));
            System.out.println("열쇠 + 자물쇠" + Arrays.deepToString(lock));
            
            
        return false;
        
        
    }


            //열쇠 회전, 열쇠를 돌려줘야 되니까. tone에 key을 넣어준다.
            private static int[][] typoon(int[][] key){
                int[][] tone = new int[key.length] [key[0].length];
                    for(int i=0; i<tone.length; i++){
                        for(int j =0; j<tone.length; j++){
                    //열쇠가 돌아가면서 x축은 그대로 y축으로 도니까. -1-j를 넣음
                            tone[i][j] = key[key.length-1-j][i];
                        }
                    }
                    return tone;
                }

            //자물쇠로 체크한다.
            private static boolean ok(int[][] lock){
                int count = 0;
                int hole = lock.length;
                for(int i = hole; i<hole; i++){
                    for(int j =hole; j<hole; j++){
                        if(lock[i][j] == 1){ //hole은 안됨 숫자만 가능 1
                            count++; 
                        }
                    }
                }
                return count == hole;  
            }


}
