package studyJava0615;

public class sosu {
    public static void main(String[] args) {
        int[] nums = {1,2,7,6,4};

        System.out.println(sosu(nums));
    }

    public static int sosu(int[] nums) {
        int answer = 0;
        // nums에 숫자가 3개 있어서 for문 3번 돌림
        for (int i = 0; i < nums.length - 2; i++) { // 1번째 숫자
            // 첫번째 자리는 0번째부터 nums길이에 -2를 넣은건 for문3개라서
            for (int j = i + 1; j < nums.length - 1; j++) { // 2번째 숫자
                for (int k = j + 1; k < nums.length; k++) {// 3번째 숫자]
                    int sum = nums[i] + nums[j]+ nums[k];
                    if(bool(sum)){
                        answer++;
                    
                    }
                }
            }
             
        }
    
        return answer;
    }

    public static boolean bool(int num){
        for(int i =2; i<num; i++){
            if(num%i==0) return false;
        }
        return true;
    }
    

}
