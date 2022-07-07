package studyJava0701.example_20220701_multi_implement.example_20220701_multi_implement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class login {
      static SmartTelevision st = new SmartTelevision();

    public static void Login() {
      Map<String, String> loginMap = new HashMap<>();
      //ID할당
      loginMap.put("k", "0000");
  
      while (true) {
        Scanner sc = new Scanner(System.in);

        //ID, PWD입력
        System.out.print("ID를 입력하세요 : ");
        String id = sc.nextLine();
        System.out.print("비밀번호를 입력하세요 : ");
        String pw = sc.nextLine();
        
        //내 ID와PWD를 비교하고 맞으면 로그인
        if (!loginMap.containsKey(id)) {
          System.out.println("입력하신 ID가 존재하지 않습니다.");
        } else {
          if (loginMap.get(id).equals(pw)) {
            System.out.println("--------------------");
            System.out.println(id + "님, 안녕하세요.");
            System.out.println("로그인 되었습니다. :) ");
            System.out.println("--------------------");
            st.sunho();
            return;
          } else {
            System.out.println("비밀번호가 일치하지 않습니다.");
          }
        }
      }
      
    }
    public static void main(String[] args){
        login.Login();
    }
  

  
 
  }
  
  // }
  // }
  // 필드
  // Map<String,String> testMap= = new HashMap<String,String>(); //testMap이라는 해쉬맵
  // 선언
  // ArrayList<String> arrChannel = new ArrayList<String>(); //arrChannel이라는
  // arrylist선언
  // Scanner scanner = new Scanner(System.in); //scanner라는 스캐너 선언
  
  // while(true){
  // System.out.print("Id를 입력하세요 > ")
  // String id = scanner.nextLine();
  // System.out.print("보고싶으신 채널을 입력하세요 > ")
  // String saveChannel = scanner.next();
  // arrChannel.add(saveChannel);
  // testMap.put("aaa",saveChannel);
  // }if (!testMap.containsKey(id)) {
  // System.out.println("입력하신 ID가 존재하지 않습니다.");
  // }
  // }
  // }
  
  // String saveId = scanner.next();// 스캐너 입력받은 내용을 saveId라는 변수에 넣는다
  // while (true){
  // System.out.print("ID를 입력하세요 : ");
  // String saveId = scanner.nextLine();
  // System.out.print("원하시는 채널을 입력하세요!");
  // String arrChannel = scanner.nextLine();
  
  // testMap.put("aaa",arrChannel);// saveId라는 변수를 arrID에 넣는다.
  
  // arrID라는
  // ArrayList선언
  // Scanner scanner = new Scanner(System.in); // scanner라는 Scanner선언
  // String saveId = scanner.next();// String타입의 scanner 를 saveId라는 String변수에 저장
  // saveId = scanner.next();// 스캐너 입력받은 내용을 saveId라는 변수에 넣는다
  // testMap.put("saveId",);// saveId라는 변수를 arrID에 넣는다.
  // scanner.close(); //scanner.호출을 종료한다.
  // ArrayList<String> arrChannel = new ArrayList<String>();
  // Map<String, String> loginMap = new HashMap<>();
  
  // loginMap.put("aaa", arrChannel[0]);
  // loginMap.put("aaa", arrChannel[1]);
  // loginMap.put("aaa", arrChannel[2]);
  
  // while (true) {
  // Scanner sc = new Scanner(System.in);
  
  // System.out.print("ID를 입력하세요 : ");
  // String id = sc.nextLine();
  // System.out.print("원하시는 채널을 입력하세요!");
  // String pw = sc.nextLine();
  
  // if (!loginMap.containsKey(id)) {
  // System.out.println("입력하신 ID가 존재하지 않습니다.");
  // } else {
  // if (loginMap.get(id).equals(pw)) {
  // System.out.println("아이디와 비밀번호가 일치합니다.");
  // return;
  // } else {
  // System.out.println("비밀번호가 일치하지 않습니다.");
  // }
  // }
  // }
