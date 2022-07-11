public class Novice implements Car{
    String name = "초보자";
    @Override
    public void run() {}

    @Override
    public void Tier() {
        System.out.println(this.name);
        System.out.println(this.name + "은 시속 30Km이상을 달릴 수 없습니다.");
        System.out.println("초보자는 고속도로에 진입할 수 없습니다.");
    }
}
