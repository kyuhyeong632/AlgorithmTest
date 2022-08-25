public class Street1 {

    public int solution(int N){
        int tmp = N;
        int sumOne = 0;
        int sumTwo = 0;
        while(tmp > 0){
            sumOne += tmp % 10;
            tmp /= 10;
        }
        if(sumOne == 1 ) return N * 10;

        while(sumTwo != sumOne){
            N++;
            int temp = N;
            sumTwo = 0;
            while(temp > 0){
                sumTwo += temp % 10;
                temp /= 10;
            }

        }
        return N;


    }

    public static void main(String[] args) {
        Street1 obj = new Street1();
        int number = 28;
        System.out.println("sol" + obj.solution(number));

    }

}
