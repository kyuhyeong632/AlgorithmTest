public class FiboancciRecur {
    static int[] fibo;
    public int fibonacciRecur(int num){

        if(fibo[num] > 0 ){
            return fibo[num];
        }
        if(num == 1){
            return fibo[num] = 1;
        }else if(num == 2){
            return fibo[num] =1;
        }else{
            return fibo[num] = fibonacciRecur(num-2) + fibonacciRecur(num-1);
        }



    }

    public static void main(String[] args){
        FiboancciRecur obj = new FiboancciRecur();
        int n = 10;
        fibo = new int[n+1];

        System.out.println(obj.fibonacciRecur(n));

        for(int i = 1; i<fibo.length; i++){
            System.out.print(fibo[i]+" ");

        }



    }
}
