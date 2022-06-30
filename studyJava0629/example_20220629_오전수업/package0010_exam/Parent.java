package package0010_exam;

public class Parent {

    public String bagName;
    public int money;

    public Parent(String input_bagName, int input_money) {
        this.bagName = input_bagName;
        this.money = input_money;
    }

    public void goToWork() {
        System.out.println("나는 회사에 출근합니다");
    }

    public boolean buyBranch(int cost) {
        if(cost < this.money) {
            System.out.println("사 먹을 수 있습니다");
            return true;
        }else {
            System.out.println("사 먹을 수 없습니다");
            return false;
        }
        
    }
    
}
