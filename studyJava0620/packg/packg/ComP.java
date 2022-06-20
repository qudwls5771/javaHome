package packg;


import java.util.ArrayList;
import java.util.Scanner;
public class ComP {
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
    Scanner sc = new Scanner(System.in);
    private String noteB;
    private String cpu;
    private String ram;
    private String ssd;
    ArrayList<ComP> comList = new ArrayList<ComP>();

    public ComP(){

    }



    public String getNoteB(){
        return noteB;
    }

    public void setNoteB(String noteB){
        this.noteB = noteB;
    }

    public String getCpu(){
        return cpu;
    }
    public void setCpu(String cpu){
        this.cpu = cpu;

    }

    public String getram(){
        return ram;
    }
    public void setram(String ram){
        this.ram = ram;

    }

    public String getssd(){
        return ssd;
    }
    public void setssd(String ssd){
        this.ssd = ssd;

    }


 


    
}
