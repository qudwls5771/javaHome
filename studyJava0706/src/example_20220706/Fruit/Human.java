package studyJava0706.src.example_20220706.Fruit;


import example_20220706.exam01_field_polymorphism.newHankookTire;

public interface Human {

    default void Pick(Fruit fruit) {
        if (fruit instanceof Grape) {
            System.out.println("포도 젤리먹는다.");
        } else if (fruit instanceof Peach) {
            System.out.println("복숭아 젤리먹는다.");
        } else if (fruit instanceof Mango) {
            System.out.println("망고 젤리먹는다.");
        }
    }

}
