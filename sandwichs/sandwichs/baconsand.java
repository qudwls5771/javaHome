package sandwichs;

public class baconsand extends sandwich{
    String bacon;
    String lettuce;
    baconsand(String bread, String butter,String bacon, String lettuce ){
        
        this.bread = "bread";
        this.butter= "butter";
        this.bacon = "bacon";
        this.lettuce = "lettuce" ;

    }
    public void bcinfo(){
        System.out.println(bread);
        System.out.println(butter);
        System.out.println(bacon);
        System.out.println(lettuce);
        
    }

    public void showInfo(){
        System.out.println(this.bread + " " + this.butter + " " + this.bacon + " " + this.lettuce);
    }
}