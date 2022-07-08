package studyJava0706.src.example_20220706.Fruit;

public class Fruit_E {

    //과일 젤리
    public Fruit fruit_G = new Grape();
    public Fruit fruit_P = new Peach();
    public Fruit fruit_M = new Mango();


    public Fruit[] fruits_F = {
            new Grape(),
            new Peach(),
            new Mango()
    };

    public void eat_H() {
        Grape grape = (Grape) fruit_G;
        Peach peach = (Peach) fruit_P;
        Mango mango = (Mango) fruit_M;

        System.out.println("------------젤리 고르다.---------------");
        grape.Pick(fruit_G);
        peach.Pick(fruit_P);
        mango.Pick(fruit_M);
        grape.eat("kim");
        peach.eat("lee");
        mango.eat("jung");

    }
}
