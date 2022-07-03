package package0003_inputDataCheck;

public class CheckYn {
    public static boolean CheckYn(int check, String type) {

        if(type == "inputCheck") {
            if(check == 1) {
                System.out.println("데이터에 저장합니다");
                return true;
            }else if(check == 2) {
                System.out.println("입력값을 삭제합니다");
                return false;
            }else {
                System.out.println("입력을 올바르게 해 주세요");
                System.out.println(check+"//"+type);
                return false;
            }
        }else if(type == "brakeCheck") {
            if(check == 1) {
                System.out.println("데이터 입력을 계속합니다");
                return true;
            }else {
                System.out.println("데이터 입력을 종료합니다");
                return false;
            }

        }else {
            return false;
        }


         
    }


}
