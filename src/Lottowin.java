import java.util.ArrayList;

public class Lottowin {
/* 마무리 하기 4가지 test case 오류 잡기 */
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCount = 0;
        int winCount = 0;

        ArrayList<Integer> numList = new ArrayList<>();

        for(int i = 0; i<lottos.length; i++) {
            numList.add(lottos[i]);
        }

        for(int i = 0; i<win_nums.length; i++){
            for(int j = 0; j<numList.size(); j++){
                if(numList.get(j) == 0){
                    zeroCount += 1;
                    numList.remove(j);
                }else if(win_nums[i] == numList.get(j)){
                    winCount++;
                    numList.remove(j);
                }
            }
        }

        int winNum = winCount+zeroCount;



        switch (winNum){
            case 6 : answer[0] = 1; break;
            case 5 : answer[0] = 2; break;
            case 4 : answer[0] = 3; break;
            case 3 : answer[0] = 4; break;
            case 2 : answer[0] = 5; break;
            default: answer[0] = 6; break;
        }

        switch (winCount){
            case 6 : answer[1] = 1; break;
            case 5 : answer[1] = 2; break;
            case 4 : answer[1] = 3; break;
            case 3 : answer[1] = 4; break;
            case 2 : answer[1] = 5; break;
            default: answer[1] = 6; break;
        }

        return answer;
    }

    public static void main(String[] args) {
        Lottowin obj = new Lottowin();
        int[] winNumbers = {31, 10, 45, 1, 6, 19};
        int[] lottoNum = {44, 1, 0, 0, 31, 25};

        int[] price = obj.solution(lottoNum, winNumbers);

        System.out.println("최고 등수는 = " + price[0] + " 등");
        System.out.println("최저 등수는 = " + price[1] + " 등");


    }


}
