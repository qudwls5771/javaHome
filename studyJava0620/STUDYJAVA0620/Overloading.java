package STUDYJAVA0620;

public class Overloading {

        //오버로딩 : 필드값을 세팅하고 생성자를 선언해서 서로 다른 값을 객체를 생산하기 위해서 사용한다. 
        //필드값 생성
        public String company = "Hyundai";
        public String model;
        public String color;
        public int maxSpeed;


        //생성자 선언
        public Overloading(){

        }

        public Overloading(String model){
            this.model = model; //this는 필드값을 나타낸다.
        }

        public Overloading(String model, String color){
            this.model = model;
            this.color = color;
        }

        public Overloading(String model, String color,int maxSpeed){
            this.model = model;
            this.color = color;
            this.maxSpeed = maxSpeed;
        }
        
}
