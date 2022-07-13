public class Pro implements car {
    String name = "숙련자";
    @Override
    public void run() {}


    @Override
    public void Tier() {
        System.out.println(this.name);
        System.out.println(this.name + "은 최대시속 60 ~ 100Km이하을 달릴 수 있습니다.");

    }
}
