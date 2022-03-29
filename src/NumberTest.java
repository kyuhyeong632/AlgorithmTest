import java.util.Arrays;

public class NumberTest {

    public int solution(int[] numbers){
        int answer = 0;

        for(int i = 0; i< 10; i++){
            int cnt = 0;
            for(int j = 0; j< numbers.length; j++){
                if(i == numbers[j]){
                    cnt++;
                }
            }
            if(cnt == 0){
                answer += i;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        NumberTest obj = new NumberTest();
        int[] nums = {1,2,3,4,6,7,8,0};

        System.out.println(obj.solution(nums));

    }
}
