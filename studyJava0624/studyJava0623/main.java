package studyJava0623;

public class main{
    public static void main(String[] args){

        usePotion();
        

    }
        private static void usePotion() {
            Redpotion redpotion = new Redpotion(30, 1);
            Redpotion redpotion_x3 = new Redpotion(30, 3);

            redpotion.usePotionText();

            int effectHP = redpotion.useItem(20);
            int effectHP_x3 = redpotion_x3.useItem(30);

            System.out.println("포션사용" + effectHP);
            System.out.println("포션사용" + effectHP_x3);

        }



    
}