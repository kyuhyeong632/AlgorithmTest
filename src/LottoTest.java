public class LottoTest {
    public int[] solution(){
        int[] numArr = new int[6];

        for(int i = 0; i<numArr.length; i++){
            int number = (int)(Math.random()*46) +1;
            System.out.println(i+" th = " + number);

            numArr[i] = number;

        }

        return numArr;
    }

    public static void main(String[] args) {
        LottoTest obj = new LottoTest();

        int[] lottoNum = obj.solution();

        for(int i = 0; i<lottoNum.length; i++){
            System.out.print(lottoNum[i] + " ");
        }

    }
}
