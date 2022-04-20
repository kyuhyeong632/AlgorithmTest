import java.util.ArrayList;
import java.util.Arrays;
/* 마라톤에서 완주하지 못한 참가자 찾기 _ 미완성 220420 */
public class Marathon {

    public String solution(String[] participant, String[] completion){
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i = 0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                answer += participant[i];
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Marathon obj = new Marathon();
        String[] part = {"leo", "kiki", "eden"};
        String[] comple = {"eden", "kiki"};
        System.out.println(obj.solution(part, comple));

    }
}
