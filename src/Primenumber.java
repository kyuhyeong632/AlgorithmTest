public class Primenumber {
/* 만들어지는 소수의 갯수 확인 */
    public int solution(String numbers){
        int answer = 0;
        int[] numArr = new int[numbers.length()];
        for(int i = 0; i<numbers.length(); i ++){
            numArr[i] = numbers.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        StrDistance obj = new StrDistance();
        int[] answer = obj.solution("kimkyuhyeong", 'k');
        for(int x : answer){
            System.out.print(x+" ");
        }

        System.out.println(answer);
    }
}
