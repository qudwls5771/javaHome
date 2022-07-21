package example_20220718_Object_unkown;

public class AnonymousExample {
    public static void main(String[] args) {

        //1. 필드값으로 익명객체 사용
        Anonymous anonymous_1 = new Anonymous();
        anonymous_1.field.wake();
        anonymous_1.wayToWork_1.run();
        System.out.println("--------------------");

        //2. 메서드(지역변수)로 익명객체 사용
        anonymous_1.method1();
        anonymous_1.method3();
        System.out.println("--------------------");

        //3. 매개변수로 익명객체 사용
        anonymous_1.method2(new Person() {
            @Override
            void wake() {
                System.out.println("11시에 일어났습니다!!!");
            }
        });
        anonymous_1.method4(new WayToWork() {
            @Override
            void run() {
                System.out.println("빨리 뛰어!!");
            }
        });
        //문제)
        //매개변수로 익명객체를 받고
    }
}
