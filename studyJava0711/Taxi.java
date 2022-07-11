public class Taxi implements Car, hiPass{
    String name = "택시";
    @Override
    public void run() {
        System.out.println(this.name+"가 달린다.");
    }

    @Override
    public void Tier() {

    }

    @Override
    public void hiPass_M() {
        System.out.println(this.name+"의 하이패스 요금은 2000원입니다.");
    }

    @Override
    public void exit() {

    }
}
