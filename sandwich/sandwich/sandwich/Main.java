package sandwich;
import java.util.*;
public class Main {
    public static void main(String[] arg){
        
        
     
        
       
        
        pumkinsand pumkinsand = new pumkinsand("빵", "버터", "호박");
        pumkinsand.showInfo();


        ArrayList<pumkinsand> pri = new ArrayList<>();
        pri.add(new pumkinsand("빵", "버터", "호박"));
        for(int i = 0; i<pri.size(); i++){
            pumkinsand week = pri.get(i);
            week.showInfo();
        }
        eggsalsand eggsalsand = new eggsalsand("빵","버터" , "에그", "샐러드");
        ArrayList<eggsalsand> third = new ArrayList<>();
        third.add(new eggsalsand("빵","버터" , "에그", "샐러드"));
        for(int i = 0; i<third.size(); i++){
            eggsalsand week = third.get(i);
            week.showInfo();
        }
        abocadosand abocadosand = new abocadosand("빵", "버터", "아보카도","에그");
        ArrayList<abocadosand> wens = new ArrayList<>();
        wens.add(new abocadosand("빵", "버터", "아보카도","에그"));
        for(int i = 0; i<third.size(); i++){
            abocadosand week = wens.get(i);
            week.showInfo();
        }
        baconsand baconsand = new baconsand("빵", "버터", "베이컨", "상추");
        ArrayList<baconsand> two = new ArrayList<>();
        two.add(new baconsand("bread", "butter", "베이컨", "상추"));
        for(int i = 0; i<two.size(); i++){
            baconsand week = two.get(i);
            week.showInfo();
        }
        blueberrysand blueberrysand = new blueberrysand("빵", "버터", "블루베리", "아보카도", "egg");
        ArrayList<blueberrysand> mon = new ArrayList<>();
        mon.add(new blueberrysand("bread", "butter", "blueberry", "abocado", "egg"));
        for(int i = 0; i<mon.size(); i++){
            blueberrysand week = mon.get(i);
            week.showInfo();
        }
     
        ArrayList<mo> moList = new ArrayList<mo>();
      
        for(int i=0 ;i < moList.size(); i++){
                if(i == 0) {
                    System.out.println("월요일 샌드위치입니다.");
                }
                if(i == 1){
                    System.out.println("화요일 샌드위치입니다.");
                }
                if(i == 2){
                    System.out.println("수요일 샌드위치입니다.");
                }
                if(i == 3){
                    System.out.println("목요일 샌드위치입니다.");
                 }
                if(i == 4){
                    System.out.println("금요일 샌드위치입니다."); 
                }
      }

    }
    
}
