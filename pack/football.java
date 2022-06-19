import java.util.Random;
import java.util.Scanner;

public class football {
    public static void main(String[] args){
        String fpn[] = {"날강두", "패스마스터는?", "알리바바와 40인의 도적", "씰룩썔룩 웃고있는", "21세기 정통 스트라이커"};
        String fp[] = {"호날두", "알론소", "알라바", "마르셀루", "레반도프스키"};
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        //배열의 입력하는 걸 저장
        int fp1[] = new int[5];
        //정확도 수치(틀린 문자개수)
        int no = 0; 
        //지단어 글자 수가 더 작은 것을 기준으로 비교해주는 변수를 설정
        int cyc =0;
        System.out.println("축구선수들의 별명?을 보고 이름을 맞추시오!!!!!! \n");
        
        // 선수 이름
        for(int i = 0; i<fp.length; i++){
            int fp2 = r.nextInt(fp.length);
            //중복 제거 if문
            if(fp1[fp2] == 1){
                i--;
                //중복 나오면 다시 돌아가게 하기!
                continue;
            } else {
                //중복 안나오면 값 나옴
                fp1[fp2] = 1;
            }
            //랜덤하게 문제
            System.out.println(fpn[fp2]);
            //입력한 거 저장
            String in = scanner.nextLine();

            cyc = in.length();

            //x를 누르면 프로그램 종료하게 설정
            if(in.equals("x")){
                System.out.println("종료");
                break;//끝!
            //문자 길이
            }else if(fp[fp2].length() < cyc){
                cyc = fp[fp2].length();
            }
            //문제 정답과 오답 판별
            if(fp[fp2].equals(in)){ //입력한 값을 비교하고 판단한다.
                System.out.println("정답!\n"); //맞으면 정답 출력
            }else{
                System.out.println("오답\n"); //틀리면x로 출력
            }
            //문제 틀린 개수
            for(int j =0; j< cyc; j++){
                //charAt()은 문자열을 이용해서 문자하나하나 검사한다.
                if(fp[fp2].charAt(j) != in.charAt(j)){
                    no++;//틀릴경우 증가
                    System.out.println("몇개 증가하냐" + no);
                }
            }
            //문자 정답길이 Math = 수학관련 객체 , abs = 인자값에 대한 절대값을 반환
            no = no+Math.abs(in.length() - fp[fp2].length());

        }

        System.out.println("틀린 개수 : " + no + "\n");
        System.out.println("끝났습니다.");




    }
    
}
