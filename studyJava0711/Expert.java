public class Expert implements car {
    String name = "전문가";
    @Override
    public void run() {}


    @Override
    public void Tier() {
        System.out.println(this.name);
        System.out.println(this.name + "은 시속 100Km이상을 달릴 수 있습니다.");
    }
}
