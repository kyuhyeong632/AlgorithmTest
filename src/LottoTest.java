import java.util.Arrays;

public class LottoTest {
    public int[] solution(){
        /*
        * 13 23 24 5 44 35
        * 5 17 10 22 14 29
        * 2 7 23 29 33 43
        * 14 15 17 21 26 40
        * 3 5 20 38 41 44
        * 23 25 30 42 44 45
        * 블로그 개설, 사이드 프로젝트 준비
         *
         * */
        int[] numArr = new int[6];

        for(int i = 0; i<numArr.length; i++){
            int number = (int)(Math.random()*46) +1;
            System.out.println(i+" th = " + number);

            numArr[i] = number;

        }
        Arrays.sort(numArr);
        return numArr;
    }

    public static void main(String[] args) {
        LottoTest obj = new LottoTest();
        String str = "helle";
        String[] strArr = new String[2];
        str.length();
        int[] lottoNum = obj.solution();

        for(int i = 0; i<lottoNum.length; i++){
            System.out.print(lottoNum[i] + " ");
        }

    }
}
