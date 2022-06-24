package slimeLand;

import java.util.*;

public class Monster {
    
    

    public String name;
    public int hp;
    public int mp;
    public int hit;
    public int amor;

        

    
/*     public Monster() {
        this.name = "평범한 괴물";
        this.hp = 10;
        this.mp = 0;
        this.hit = 0;
        this.amor = 0;

    } */
    
    public Monster(String name){
        this.name = name;

    }

    public Monster(String name, int hp, int mp, int hit, int amor) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.hit = hit;
        this.amor = amor;

    }

    public void info() {
        System.out.println("__________" + name + "__________");
        System.out.println("Name = " + this.name);
        System.out.println("HP = " + this.hp);
        System.out.println("MP = " + this.mp);
        System.out.println("MP = " + this.amor);
    }

    public void itemDrab(){
        ArrayList<item> itemList = new ArrayList<item>();
        itemList.add(new item(1, "검", 5));
        itemList.add(new item(2, "활", 10));

        for(int i =0; i<itemList.size(); i++){
            item item_T = itemList.get(i);
            item_T.showItemInfo();
        }
        System.out.println();
    }

   


   //for -> if -> switch
   //몬스터도 인벤토리 같은 걸 만들어서 그 안에 아이템이 들어있는데 그 중에 랜덤값으로 드랍하게 한다.
   //1. 일반 공격 2. 스킬  3. 포션 빨기 4. 도망가기
    
    
    
}