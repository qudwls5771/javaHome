import java.util.ArrayList;
import java.util.Scanner;

public class ssss {

public static void main(String[] args) {

        int count = 0;
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] mode = new int[10];
        for(int i=0; i<mode.length; i++) {
            mode[arr[i]]++;
        }

        int modeNum = 0; // 최빈수
        int modeCnt = 0; // 최빈수가 출현한 횟수

        for(int i=0; i<10; i++) {
            if (modeCnt < mode[i]) {
                modeCnt = mode[i];
                modeNum = i;
            }
        }
        System.out.println("최빈수 : " + modeNum + "    cnt : " + modeCnt);
    }
}
