package example_20220706.Fruit;

public class Peach implements Fruit, Human{

    String peach = "복숭아젤리";

    @Override
    public void Fruits() {
        System.out.println(peach);
    }

    @Override
    public void eat(String name) {
        System.out.println(name +"이" + peach + "먹는다.");
    }
}
