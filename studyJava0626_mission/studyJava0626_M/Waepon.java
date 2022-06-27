package studyJava0626_M;

public class Waepon {
    public static final String Dname = "주먹";
    public static final int D_AttRange = 1;
    public static final int D_ChangeTime = 1; 


    public String name = "주먹";
    public int AttRange = 1;
    public int ChangeTime = 1; 
    
    
    public void attAction() {// 무기 장착
        System.out.println("무기 :" + this.name + "을 장착");      
    }

    public void WaeponC(){
        System.out.println("무기 교체");
    }

    public void WaeponB(String name_B){ // 교체하기 전
        this.name = name_B;
    }

  

}
