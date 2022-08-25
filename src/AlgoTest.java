import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgoTest {
    /*public int solution(String s){
        String niceStr = "";

        for(int i =0; i<s.length()-2; i++){
            if(s.charAt(i) == s.charAt(i+1) &&
                s.charAt(i+1) == s.charAt(i+2)){
                String tmp = "" + s.charAt(i) + s.charAt(i + 1) + s.charAt(i + 2);
                if(niceStr.isEmpty()){
                    niceStr = tmp;
                }else{
                    if(Integer.parseInt(tmp) > Integer.parseInt(niceStr)){
                        niceStr = tmp;
                    }
                }
            }
        }
        if(niceStr.isEmpty()){
            return -1;
        }else if(Integer.parseInt(niceStr) == 0){
            return 0;
        }

        int niceNum = Integer.parseInt(niceStr);
        return niceNum;
    }*/
    /*public int solution(int[] levels) {
        int answer = 0;

        Arrays.sort(levels);

        double top =levels.length * 25.0 / 100.0;
        int lvNum = (int)Math.floor(top);
        if(lvNum != 0){
            answer = levels[levels.length-lvNum];
        }else{
            return -1;
        }


        return answer;
    }*/
    public String solution(String sentence, String labels, String target){
        String answer = "";
        String [] strArr = sentence.split(" ");
        String [] labelArr = labels.split(" ");
        String [] targetArr = target.split(" ");

        String [] answerArr = new String[targetArr.length];

        for(int i = 0; i<targetArr.length; i++){
            for(int j = 0; j<strArr.length; j++){
                if(targetArr[i].equals(strArr[j])){
                    answerArr[i] = labelArr[j];
                }else if(i !=0 && (targetArr[i-1]+targetArr[i]).equals(strArr[j])){
                    if(answerArr[i] == null && answerArr[i-1] == null){
                        answerArr[i-1] = labelArr[j];
                        answerArr[i] = labelArr[j];
                    }
                }

            }
        }

        for(int i = 0; i<answerArr.length; i++){
            if(i == 0){
                answer += answerArr[i];
            }else{
                answer += " "+ answerArr[i];
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        AlgoTest obj = new AlgoTest();

        String str  = "Federal Reserve announces a broad set of new rules";
        String lb = "ORG ORG V A ADJ O O O O";
        String tg = "Fed eral Reserve an nounces a broad set of new re les";

        System.out.println(obj.solution(str, lb, tg));

    }
}
