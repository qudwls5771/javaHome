public class Bus implements Car, hiPass{

    String name = "버스";

    @Override
    public void run() {
        System.out.println( this.name + "가 달린다.");
    }

    @Override
    public void Tier() {

    }

    @Override
    public void hiPass_M() {
        System.out.println(this.name + "하이패스 무료입니다.");
    }

    @Override
    public void exit() {
        System.out.println(this.name + "하이패스를 나옵니다.");
    }
}
