package miniProject;

public class Computer {
    //김준석 선생님은 컴퓨터를 사고 싶다.
        //프로그래밍으로 사고 싶은 컴퓨터의 성능지표를 출력하는 시스템을 개발하고 싶다.
        //데이터를 받아오고, 그 데이터를 통해 컴퓨터의 성능을 출력하는 시스템 개발
        //컴퓨터 이름(맥북pro 2021)
        //cpu 성능
        //Ram
        //SSD(하드디스크)
        //단, 데이터가 없는 필드값에 대해 오버로딩으로 처리하세요.
        //데이터가 부족할 경우, 여러 데이터를 동시에 받을 경우에 대해 고민하시오.
        //배열, if문, for문 복합적으로 쓰시면 어떨까요?
        //Scanner로 데이터를 받아옵니다.

    
    public String mBook = "맥북pro2021";
    public String cpu = "M1PRO";
    public String ram = "16GB";
    public String ssd = "512GB";

    public Computer(){
     
    }
    
    public Computer(String mBook_, String cpu_, String ram_, String ssd_){
        this.mBook = mBook_;
        this.cpu = cpu_;
        this.ram = ram_;
        this.ssd = ssd_;
    }

    public String comP(){
        System.out.println(this.mBook + " " +this.cpu+ " " + this.ram+ " " + this.ssd);
        return mBook;

    }


    
  
    
}
