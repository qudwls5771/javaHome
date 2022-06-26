package sandwich;

public class abocadosand extends sandwich {
    String abocado;
    String egg;
    
    abocadosand(String bread, String butter,String egg, String abocado ){
        this.bread = bread;
        this.butter= butter;
        this.abocado = abocado;
        this.egg = egg;
     
    }

    public void ainfo(){
        System.out.println(bread);
        System.out.println(butter);
        System.out.println(egg);
        System.out.println(abocado);
        
    }

    public void showInfo(){
        System.out.println(this.bread + " " + this.butter + " " + this.egg + " " + this.abocado + " : " + "아보카도 샌드위치");
    }
}
