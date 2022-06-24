package sandwich;

public class pumkinsand extends sandwich{
    String pumkin;
    
    pumkinsand(String bread, String butter, String pumkin ){
        
        this.bread = bread;
        this.butter= butter;
        this.pumkin = pumkin;

    }
    public void pinfo(){
        System.out.println(bread);
        System.out.println(butter);
        System.out.println(pumkin);
        

        
    }

    public void showInfo(){
        System.out.println(this.bread + " " + this.butter + " " + this.pumkin);
    }
}
