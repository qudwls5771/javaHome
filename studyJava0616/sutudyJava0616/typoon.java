package sutudyJava0616;

public class typoon {
    // 열쇠 회전, 열쇠를 돌려줘야 되니까. tone에 key을 넣어준다.
    private static int[][] typoon(int[][] key) {
        int[][] tone = new int[key.length][key[0].length];
        for (int i = 0; i < tone.length; i++) {
            for (int j = 0; j < tone.length; j++) {
                // 열쇠가 돌아가면서 x축은 그대로 y축으로 도니까. -1-j를 넣음
                tone[i][j] = key[key.length - 1 - j][i];
            }
        }
        return tone;
    }
}
