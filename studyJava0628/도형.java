import java.util.Scanner;

public class 도형 {


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

    private static void startForIssss() {// 원

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
                    System.out.print("@");
                }else{
                    System.out.print("*");
                }
            }
            x++;
            y--;
            System.out.println();
        }
        

    }





    public static void baeyuls(){
        
        String[][] a = new String[30][30];
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                a[i][j] = "*";
            }
        }

        for(int i = 12; i <17; i++){
            for(int j = 15; j<29; j++){
                a[i][j] = "@";
            }
        }

        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }


    }

    
    public static void baeyul(){
        
        String[][] a = new String[30][30];
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                a[i][j] = "*";
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > 0; j--) {
                if (i < j) {
                    a[i][j] = "@";
                } else {
                    a[i][j] = "*";
                }
            }
            System.out.println("");
        }


        for(int i = 10; i< 20; i++){
            for(int j = 20; j > 0; j--){
                if(i<j){
                    a[i][j] = "@";
                }else{
                    a[i][j] = "*";
                }
            }
        }


        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

        
    public static void baeyul_(){
        
        String[][] a = new String[60][60];
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                a[i][j] = "*";
            }
        }

        for (int i = 8; i < 15; i++) {
            for (int j = 7; j < 15; j++) {
                if (i * i + j * j <= 8 * 8) {
                    a[i][j] = "*";
                } else {
                    a[i][j] = "@";
                }
            }
            
        }


        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    public static void samgaq(){
        System.out.println("출력할 줄을 입력해주세요");
        System.out.print(">");
        Scanner scan = new Scanner(System.in);
    
        int answer;
        int center;
    
        answer = scan.nextInt();
        //answer = answer * 2 + 1;
        answer = answer*2+1;
        center = answer / 2;
    
        char[][] dia = new char[answer][answer];
    
        int start = center;
        int end = center;      
    
    
        for (int a = 0; a < answer; a++) {
          for (int b = 0; b < answer; b++) {
            if (start <= b && b <= end) {
              dia[a][b] = '@';
            } else {
              dia[a][b] = '*';
            }
          }

          
          if (a < center) {
              start--;
              end++;
          } else {
            start++;
            end--;
          }

        }
      
    
        for (int a = 0; a < answer; a++) {
          for (int b = 0; b < answer; b++) {
            System.out.print(dia[a][b]);
          }
          System.out.println();
        }
        scan.close();
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
        //smallX();
       // baeyuls(); //사각형
       // baeyul(); // 직삼각형 
        //baeyul_(); // 원
        samgaq();

    }
}
