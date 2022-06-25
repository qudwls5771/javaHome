package sandwich2;

public class blueberrysand extends sandwich{
    String blueberry;
    String abocado;
    String egg;

    

    public blueberrysand(String bread, String butter,String blueberry, String abocado, String egg ){
        this.bread = "bread";
        this.butter= "butter";
        this.blueberry = "blueberry";
        this.abocado = "abocado";
        this.egg = "egg";

    } 

    public void showInfo(){
        System.out.println(this.bread + " " + this.butter + " " + this.egg + " " + this.abocado + " " + this.blueberry);
    }

 


}
