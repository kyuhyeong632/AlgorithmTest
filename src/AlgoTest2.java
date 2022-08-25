public class AlgoTest2 {

    public int solution(int[] numbers){
        int answer = 0;
        int cnt = 0;

        for(int num : numbers){
            if(cnt == 0){
                answer = num;
                cnt++;
            }else if(answer == num){
                cnt++;
            }else{
                cnt--;
            }
        }
        if(cnt == 0){
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        AlgoTest2 obj = new AlgoTest2();
        int [] numarr = {6,1,6,6,7,5,6,7};
        System.out.println(obj.solution(numarr));

    }
}
