package example_20220706.exam01_field_polymorphism;

public class Number01_brake implements Brake, Pedal{
    @Override
    public void stop(){
        System.out.println("Number01 브레이크 실행");
    }
    @Override
    public void push(){
        System.out.println("Number01 패달 실행");
    }
}
