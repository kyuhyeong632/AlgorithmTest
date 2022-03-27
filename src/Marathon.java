import java.util.ArrayList;
import java.util.Arrays;

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
