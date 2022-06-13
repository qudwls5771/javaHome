package studyJava0613;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.w3c.dom.Text;
import java.util.ArrayList;

public class helloH {
    public static void main(String[] args) {
    // 공개, 한개, 리턴x, main(무조건 하나 있어야됨), 매개변수    
        System.out.println("Hello, welcome to the java world");

        //String[] input = {"King", "Jane"};
        ArrayList<String> input = new ArrayList<String>();
        input.add("Jane");
        input.add("Kim");
        System.out.println(solution(input));
    }

    public static String solution(ArrayList<String> seoul){
        String answer = "";
        System.out.println(seoul.size());

        //배열 실행 seoul 배열을 순회해서 kim의 위치 찾기
        for(int i = 0; i<seoul.length; i++){
            //값 비교, 위치저장
            if(seoul.get(i) == "Kim"){
                System.out.println("ok");
            }
           

        }
        StringBuffer text_test = new StringBuffer(str : "hellow");
        text_test.append(str : "abc");
        System.out.println("text_test" + text_test);

        return answer;

    }
    
}
