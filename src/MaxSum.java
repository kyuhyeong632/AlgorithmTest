public class MaxSum {
    public int solution(int n, int[][] arr){
        int answer=Integer.MIN_VALUE;
        int sum1=0, sum2=0, side1=0, side2=0;
        for(int i=0; i<n; i++){
            sum1=sum2=0;
            for(int j=0; j<n; j++){
                sum1+=arr[i][j];
                sum2+=arr[j][i];
                if(i == j){
                    side1 += arr[i][j];
                }else if(i+j == 4){
                    side2 += arr[i][j];
                }

            }
            answer=Math.max(answer, sum1);
            answer=Math.max(answer, sum2);
        }
        answer=Math.max(answer, side1);
        answer=Math.max(answer, side2);

        return answer;
    }

    public static void main(String[] args){
        MaxSum obj = new MaxSum();

        int num = 5;
        int[][] arr = {{20,5,86,84,11},{1,2,5,3,4},{11,33,22,55,44},{11,45,66,54,44},{11,11,11,11,11}};


        System.out.print(obj.solution(num, arr));
    }
}
