package sandwich;

public class eggsalsand extends sandwich{
    String egg;
    String salard;
    
    eggsalsand(String bread, String butter,String egg, String salard ){
        this.bread = bread;
        this.butter= butter;
        this.salard = salard;
        this.egg = egg;

    }
    public void einfo(){
        System.out.println(bread);
        System.out.println(butter);
        System.out.println(egg);
        System.out.println(salard);
        

        
    }

    public void showInfo(){
        System.out.println(this.bread + " " + this.butter + " " + this.egg + " " + this.salard);
    }
}
