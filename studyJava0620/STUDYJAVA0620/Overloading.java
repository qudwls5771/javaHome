package STUDYJAVA0620;

public class Overloading {


    public class Overloadig{
        public String company = "Hyundai";
        public String model;
        public String color;
        public int maxSpeed;


        
        public Overloadig(){

        }

        public Overloadig(String model){
            this.model = model;
        }

        public Overloadig(String model, String color){
            this.model = model;
            this.color = color;
        }

        public Overloadig(String model, String color,int maxSpeed){
            this.model = model;
            this.color = color;
            this.maxSpeed = maxSpeed;
        }
        



    }

    
}
