package sutudyJava0616;

public class ok {
    // 자물쇠로 체크한다.
    private static boolean ok(int[][] lock) {
        int count = 0;
        int hole = lock.length;
        for (int i = hole; i < hole; i++) {
            for (int j = hole; j < hole; j++) {
                if (lock[i][j] == 1) { // hole은 안됨 숫자만 가능 1
                    count++;
                }
            }
        }
        return count == hole;
    }

}
