public class Password {
/*
* 암호로 주고 받는 편지를 해석 하자
* 규칙은 다음과 같다
* 1. 알파벳 한 문자는 #또는 * 7개로 구성 되어 있다.
* 2. #은 이진수의 1 *은 이진수의 0으로 변환 한다.
* 3. 바뀐 이진수는 다시 10진수로 변환 하여 정수로 만든다.
* 4. 해당 정수는 아스키 번호에 맞게 알바펫으로 바꾼다
*
* # -> 1 / * -> 0 으로 변한 한 2진수로
* */
    public String solution(String str){
        String answer = "";
        int len = str.length()/7;
        for(int i = 0; i<len; i++){
            String tmp = str.substring(0,7).replaceAll("#","1").replaceAll("[*]","0");
            int num = Integer.valueOf(tmp, 2);
            answer += (char)num;
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Password obj = new Password();

        System.out.println(obj.solution("#****###**#####**#####**##**"));
    }
}
