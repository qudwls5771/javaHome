package example_20220706.Fruit;

public class Mango implements Fruit, Human {


    String mango = "망고젤리";

    @Override
    public void Fruits() {
        System.out.println(mango);
    }

    @Override
    public void eat(String name) {
        System.out.println(name +"이" + mango + "먹는다.");
    }

}
