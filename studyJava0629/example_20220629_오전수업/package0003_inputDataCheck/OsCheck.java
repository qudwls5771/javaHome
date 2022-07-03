package package0003_inputDataCheck;

public class OsCheck {
    public static void osCheck(int checkType) {
        if(checkType == 1) {
            System.out.println("Computer Type은 MAC OS 입니다");
        }else if(checkType == 2) {
            System.out.println("Computer Type은 Windows OS 입니다");
        }else {
            System.out.println("정상적인 입력이 아닙니다");
        }
    }
}
