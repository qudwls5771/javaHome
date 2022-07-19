package studyJava0626_M;

import java.awt.Toolkit;
import java.util.Arrays;

import javax.sql.rowset.spi.SyncResolver;

public class WaeponT extends Waepon{
    public static void main(String[] args) {
        WaeponT waeponT = new WaeponT();
        
       waeponT.coolTime_S();
       // waeponT.coolTime_Lan();
       // waeponT.coolTime_L();

      // waeponT.coolTime_Attack();

      


    }



    @Override
    public void coolTime_S() {
        Waepons[] productList = new Waepons[3];
        productList[2] = new Waepons("ShotSword ", 2, 3);

        // Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < productList.length; i++) {
            // toolkit.beep();
            productList[2].hit();
            System.out.println(Arrays.deepToString(productList));
            System.out.println("Cool Time : 3초");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
    @Override
    public void coolTime_L() {
        Waepons[] productList = new Waepons[3];
        productList[1] = new Waepons("LongSword", 3, 5);
    
        for (int i = 0; i < productList.length; i++) {

            productList[1].hit();
            System.out.println("Cool Time : 5초");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        

    }
    //무기 쿨타임
    @Override
    public void coolTime_Lan() {
        Waepons[] productList = new Waepons[3];
        productList[0] = new Waepons("Lance", 5, 10);

        for (int i = 0; i < productList.length; i++) {

            productList[0].hit();
            System.out.println("Cool Time : 10초");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        

    }

    

  

  



    

}
