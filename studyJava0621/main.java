import slimeLand.*;
import java.util.*;

public class main {

    static int no;
    private static String name;
    private static int dmg;

    public static void main(String[] arg) {
        // 슬라임과 대치하는 용사 상황을 코드로 구현
        // 용사를 만들자, 용사 객체 생성(1명)

        // string 메모리를 적게 쓰는 법

        ArrayList<item> itemList = new ArrayList<item>();
        itemList.add(new item(1, "검", 5, "warior"));
        itemList.add(new item(2, "활", 10, "mage"));

        for (int i = 0; i < itemList.size(); i++) {
            item item_T = itemList.get(i);
            item_T.showItemInfo();
            itemList.get(index((int)(Math.random() * (item_T.size()-1))));
        }
        System.out.println();








        ArrayList<String> name_T = new ArrayList<>();
        name_T.add("노란 호랑이");
        name_T.add("빨간 호랑이");
        name_T.add("파랑 호랑이");
        name_T.add("초록 호랑이");
        name_T.add("검은 호랑이");

        int index_T = (int)(Math.random() * (name_T.size()-1));






    }

}