import java.util.Arrays;

public class StrZip {
    public String solution(String str){
        String answer = "";
        int count = 1;
        str = str + " ";
        for(int i = 0; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }else{
                answer += str.charAt(i);
                if(count > 1){
                    answer += count;
                }
                count = 1;
            }

        }

        return answer;
    }
    public static void main(String[] args) {
        StrZip obj = new StrZip();
        String str = "KSTTTSEEKFKKKDJJGG";
        System.out.println(obj.solution(str));

    }
}
