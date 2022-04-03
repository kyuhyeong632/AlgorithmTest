import java.util.*;
public class NumArrTest {
    /* 나누어 떨어지지 않는 숫자 찾기 */
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> intList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % divisor) == 0) {
                intList.add(arr[i]);
            }

        }

        if (intList.size() > 0) {
            answer = intList.stream().mapToInt(i -> i).toArray();
            Arrays.sort(answer);
        } else {
            answer = new int[1];
            answer[0] = -1;
        }


        return answer;
    }
}
