package sandwichs;

import java.util.*;

public class Main {
    public static void main(String[] arg) {
    
        ArrayList<mo> moList = new ArrayList<mo>();
        System.out.println(moList);

        for (int i = 0; i < moList.size(); i++) {
            mo moLists = moList.get(i);
            moLists.showItemInfo();
            

            if (i == 0) {
                System.out.println("월요일 샌드위치입니다.");
            }
            if (i == 1) {
                System.out.println("화요일 샌드위치입니다.");
            }
            if (i == 2) {
                System.out.println("수요일 샌드위치입니다.");
            }
            if (i == 3) {
                System.out.println("목요일 샌드위치입니다.");
            }
            if (i == 4) {
                System.out.println("금요일 샌드위치입니다.");
            }

        }

    }

}