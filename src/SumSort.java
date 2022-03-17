import java.util.*;
public class SumSort {
    /*
     * 정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서
     * 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
     * */
    public int[] sumsort(int[] numbers) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i<numbers.length; i++){
            for(int j = i+1; j<numbers.length; j++){
                if(i !=j ){
                    int num = numbers[i] + numbers[j];
                    arr.add(num);
                }

            }

        }

        TreeSet<Integer> tArr = new TreeSet<Integer>(arr);
        int[] answer = new int[tArr.size()];
        int tmp = 0;
        for(Integer num : tArr){
            answer[tmp] = num;
            tmp++;
        }

        return answer;
    }

    public static void main(String[] args) {
        SumSort obj = new SumSort();
        int [] nums = {1,2,4,6,1,2,4};

        int[] fin = obj.sumsort(nums);
        Arrays.stream(fin).mapToObj(j -> "i" + j).forEach(System.out::println);
    }

}
