package studyJava0626_M;

import java.awt.Toolkit;

import javax.sql.rowset.spi.SyncResolver;

public class WaeponT {
    public static void main(String[] args) {
        WaeponT waeponT = new WaeponT();
        
       //waeponT.coolTime_S();
       // waeponT.coolTime_Lan();
       // waeponT.coolTime_L();

      // waeponT.coolTime_Attack();

      waeponT.coolTime_Attacks();


    }

    public Runnable coolTime_S() {
        Waepons[] productList = new Waepons[3];
        productList[2] = new Waepons("ShotSword ", 2, 3);

        // Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < productList.length; i++) {
            // toolkit.beep();
            productList[2].hit();
            System.out.println("ShotSword Attack = 3초 후 공격 울립니다.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public Runnable coolTime_L() {
        Waepons[] productList = new Waepons[3];
        productList[1] = new Waepons("LongSword", 3, 5);
    
        for (int i = 0; i < productList.length; i++) {

            productList[1].hit();
            System.out.println("Long Sword Attack = 5초 후 공격 울립니다.");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;

    }

    public Runnable coolTime_Lan() {
        Waepons[] productList = new Waepons[3];
        productList[0] = new Waepons("Lance", 5, 10);

        for (int i = 0; i < productList.length; i++) {

            productList[0].hit();
            System.out.println("Lance Attack = 10초 후 공격 울립니다.");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;

    }

    public void coolTime_Attack(){
        Thread lance = new Thread(coolTime_Lan());
        Thread longs = new Thread(coolTime_L());
        Thread shot = new Thread(coolTime_S());


        try{ // 공격 순서대로


            if(Thread.sleep(3000) == ){

            }
            lance.start();
            lance.join();

            longs.start();
            longs.join();

            shot.start();
            shot.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("공격 끝");
    }


    public void coolTime_Attacks(){
        long startTime = System.currentTimeMillis();

        try{
            //5초 지연
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Time in milliSeconds" + (endTime - startTime));
        System.out.println("Time in Seconds" + (endTime - startTime)/1000);



    }

}
