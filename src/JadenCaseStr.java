import java.util.Arrays;

public class JadenCaseStr {
    /*
     JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 단, 첫 문자가 알파벳이 아닐 때에는
     이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
     문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.

    제한 조건
    s는 길이 1 이상 200 이하인 문자열입니다.
    s는 알파벳과 숫자, 공백문자(" ")로 이루어져 있습니다.
    숫자는 단어의 첫 문자로만 나옵니다.
    숫자로만 이루어진 단어는 없습니다.
    공백문자가 연속해서 나올 수 있습니다.
*/
        public String solution(String s) {
            String answer = "";

            String[] strArr = s.toLowerCase().split(" ", -1);

            System.out.println("length = " + strArr.length);

           for(int i = 0; i<strArr.length; i++){
                System.out.println("test case "+i+"번째 = " +strArr[i]);
                if(!strArr[i].equals("")){ /* 연속하는 공백일 때 확인 */
                    if(Character.isAlphabetic(strArr[i].charAt(0))){
                        String tmp = strArr[i].substring(0,1);
                        strArr[i] = tmp.toUpperCase() + strArr[i].substring(1);
                    }
                }

                if(i != strArr.length-1){
                    answer += strArr[i]+" ";
                }else{
                    answer += strArr[i];
                }
            }

            return answer;
        }


    public static void main(String[] args) {
        JadenCaseStr obj = new JadenCaseStr();
        String str = "My iggg dgwgg 3hek       33fff 2v  ";
        System.out.println(obj.solution(str));

    }
}
