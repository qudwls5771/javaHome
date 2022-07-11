public class Expert implements Car {
    String name = "마스터";
    @Override
    public void run() {}


    @Override
    public void Tier() {
        System.out.println(this.name);
        System.out.println(this.name + "은 시속 100Km이상을 달릴 수 있습니다.");
    }
}
