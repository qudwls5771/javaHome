public class 도형 {
    private static void startForIf() {// 직사각형
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    private static void startForIs() {// 직삼각형
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void samga() { // 역삼각형
        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > 0; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

    private static void startForIss() {// 뒤집힌 직삼각형

        for (int i = 0; i < 6; i++) {
            for (int j = i; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    private static void startForIsss() {// 마름모
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 3; i > 0; i--) {
            for (int j = 1; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void startForIff() {
        for (int i = -5; i <= 5; i++) {
            for (int j = -4; j <= 4; j++) {
                if (i * i + j * j <= 5 * 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }

    private static void startForIssss() {// 마름모

        for (int i = -5; i <= 5; i++) {
            for (int j = -4; j <= 4; j++) {
                if (i * i + j * j <= 5 * 5) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }



    private static void smallX() {// 마름모
        int x = 1;
        int y = 9;

        for(int i = 1; i<=9; i++){
            for(int j = 1; j <=9 ; j++){
                if(x==j || y==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            x++;
            y--;
            System.out.println();
        }
        

    }

    public static void main(String[] args) {
        // hero Hero = new hero();
        // Hero.attack();

        // startForIf(); //직사각형
        // startForIs(); //직각삼각형
        // startForIss(); //역삼각형
        // startForIsss(); //마름모
        // startForIff(); //원
        // startForIssss();
        smallX();

    }
}
