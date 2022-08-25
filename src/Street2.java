public class Street2 {

    public boolean solution(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])
                return false;
        }
        if (A[0] != 1 || A[n - 1] != K)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        Street2 obj = new Street2();
        int[] numArr = {1,1,2,3,3,4,5,6};
        int num = 7;

        System.out.println("맞다 틀리다 = " + obj.solution(numArr, num));


    }
}
