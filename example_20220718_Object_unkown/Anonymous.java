package example_20220718_Object_unkown;

public class Anonymous extends Person {
    //필드로 익명객체 사용법

    Person field = new Person() {
        int fieldInt;
        void work() {
            System.out.println("늦잠자서 7시에 일어납니다.");
            System.out.println(fieldInt + "까지 출근 해야 합니다!");
        }
        @Override
        void wake() {
            fieldInt = 9;
            System.out.println("학생을 가르치는 교사입니다!");
            work();
        }
    };

    WayToWork wayToWork_1 = new WayToWork() {

        @Override
        void run() {
            System.out.println("내 달립니다!");
            car();

        }

        void car() {
            System.out.println("느긋하게 차타고 갑니다.");
        }
    };



    void method1() {
        Person localVar = new Person() {

            @Override
            void wake() {
                System.out.println("늦잠 자서 10시에 일어납니다!");
                work();

            }

            private void work() {
                System.out.println("학생들을 가르치는 교사입니다!!!!");
            }
        };
        localVar.wake();
    }

    void method3(/*int inputInt*/) {
        //매개변수(인자값 혹은 전역변수가 라이프사이클에 따라 살아있다)

        //지역변수(메서드의 라이프사이클에 따라 변수가 활용(살아있다)

        int outputInt;

        //익명객체 라이프 사이클 start
        WayToWork wayToWork_1 = new WayToWork() {

            @Override
            void run() {
                System.out.println("내 달립니다!!");
                car();

            }

            private void car() {
                System.out.println("느긋하게 차타고 갑니다!");
            }
        };

        ;
        wayToWork_1.run();
    }

    void method2(Person person_1) {
        person_1.wake();
    }
    void method4(WayToWork wayToWork){
        wayToWork.run();
    }
}










