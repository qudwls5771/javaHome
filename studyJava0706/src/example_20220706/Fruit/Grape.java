package example_20220706.Fruit;

public class Grape implements Fruit, Human{

    String grape = "포도젤리";
    @Override
    public void Fruits() {
        System.out.println(grape);
    }
    @Override
    public void eat(String name){
        System.out.println(name+"이" + grape + "먹는다.");
    }
}
