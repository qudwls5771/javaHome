
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class two_pick {


    public static void main(String[] args){
        int[] numbers = {2,1,3,4,1};



        System.out.println(two_pick(numbers));

    }


    private static int[] two_pick(int[] numbers) {
        int[] answer =  {};
        int sum = 0; //배열 더한 값
        ArrayList<Integer> sumList = new ArrayList<Integer>(); // 배열 더한 값 저장\

        for(int i =0; i<numbers.length-1; i++){
            for(int j =i+1; j<numbers.length; j++){
                sum = numbers[i] + numbers[j];
                if(!sumList.contains(sum)){
                    sumList.add(sum);
                    
                }
                    
            }
            
            
        }
           //  const = 변하지 않음! : 개발자가 변하지말라고 건들지말라고

        Set<Integer> set = new HashSet<Integer>(sumList);
        System.out.print(set);
        //toArray() 스트림 요소를 포함하는 배열을 반환하는 메서드입니다.
        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        
        Arrays.sort(answer);
        


      //  Collections.sort(sumList);
      //  System.out.println(sumList);
  
       // int[] answer = new int[sumList.size()];
        //for(int i = 0; i<answer.length; i++){
         // answer[i] = sumList.get(i);
        //}
        

        return answer;
    }


   
}
