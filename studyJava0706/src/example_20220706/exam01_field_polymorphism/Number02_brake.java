package example_20220706.exam01_field_polymorphism;

public class Number02_brake implements Brake, Pedal{
    @Override
    public void stop() {
        System.out.println("Number02 브레이크 실행");
    }
    @Override
    public void push() {
        System.out.println("Number02 브레이크 실행");
    }
}
