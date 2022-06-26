package sandwichs;

import java.util.ArrayList;

public class mo {
    blueberrysand blueberrysand = new blueberrysand("빵", "버터", "블루베리", "아보카도", "egg");
    baconsand baconsand = new baconsand("빵", "버터", "베이컨", "상추");
    abocadosand abocadosand = new abocadosand("빵", "버터", "아보카도","에그");
    eggsalsand eggsalsand = new eggsalsand("빵","버터" , "에그", "샐러드");
    pumkinsand pumkinsand = new pumkinsand("빵", "버터", "호박");
    

   
   public void showItemInfo(){
    System.out.println("블루베리 샌드위치 : "+blueberrysand.abocado + " "  +blueberrysand.blueberry + " " +  blueberrysand.bread + " " + blueberrysand.butter + " " + blueberrysand.egg);
    System.out.println("베이컨 샌드위치 : "+baconsand.bacon + " "  +baconsand.lettuce + " " +  baconsand.bread + " " + baconsand.butter);
    System.out.println("아보카도 샌드위치 : "+abocadosand.abocado + " "  + abocadosand.bread + " " + abocadosand.butter + " " + abocadosand.egg);
    System.out.println("에그 샌드위치 : "+eggsalsand.salard + " "  + eggsalsand.bread + " " + eggsalsand.butter + " " + eggsalsand.egg);
    System.out.println("호박 샌드위치 : "+pumkinsand.pumkin + " "  + pumkinsand.bread + " " + pumkinsand.butter);
   }




 
}
