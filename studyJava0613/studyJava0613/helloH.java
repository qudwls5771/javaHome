package studyJava0613;

import java.lang.reflect.Array;
import java.util.ArrayList;



class helloH {
    private static String str;

    public static void main(String[] args) {
    // 공개, 한개, 리턴x, main(무조건 하나 있어야됨), 매개변수    
        System.out.println("Hello, welcome to the java world");

        //String[] input = {"King", "Jane"};
        ArrayList<String> input = new ArrayList<String>();
        input.add("Jane");
        input.add("Kim");
        System.out.println(solution(input));
        
    }

    public static String solution(ArrayList<String> input){ //input = 가변성 배열이라서 equals가 안됨
        String answer = "";
        System.out.println(input.size());

        String[] name = new String[3];
        name[0] = "Kim";
        name[1] = "Park";
        name[2] = "Yi";
        System.out.println(input.size());
        //배열 실행 seoul 배열을 순회해서 kim의 위치 찾기
        for(int i = 0; i<input.size(); i++){
            //값 비교, 위치저장
            //if(name[i].equals("Kim")){
            if(input.get(i) == "Kim"){
                System.out.println("ok");
            }
           

        }
        StringBuffer stringBuffer = new StringBuffer("Hellow");
        stringBuffer.append("abc");
        System.out.println("text_test" + stringBuffer);

        return answer;

    }
    
}
