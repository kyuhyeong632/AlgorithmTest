import java.util.*;
/*      문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로,
        홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

        제한 사항
        문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
        첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.

        */

public class StringUpLow {
    public String solution(String s){
        String answer = "";
/* 첫 번째 시도시 test case 중 문자의 마지막이 공백일 경우를 고려하지 못했었음
*  spilt limit에 음수를 넣어 해결 */
        String[] strArr = s.split(" ",-1); //limit이 음수일 경우 " " 공백 문자 포함 잘라짐

        for(int i = 0; i<strArr.length; i++){
            String tmp = "";
            for(int j = 0; j<strArr[i].length(); j++){
                System.out.println("check"+j%2);
                if(j%2 == 0){
                    tmp += String.valueOf(strArr[i].charAt(j)).toUpperCase();
                }else{
                    tmp += String.valueOf(strArr[i].charAt(j)).toLowerCase();
                }
            }
            strArr[i] = tmp;
        }

        for(int i = 0; i<strArr.length; i++){
            if(i != (strArr.length-1)){
                answer += strArr[i]+ " ";
            }else{
                answer += strArr[i];
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        StringUpLow obj = new StringUpLow();

        String updown = obj.solution("try hello world ");

        System.out.println(updown+"1");
    }
}
