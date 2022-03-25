public class StrDistance {

    public int[] solution(String s, Character w) {
        int[] sd = new int[s.length()];
        int word = 1000;
        for(int i = 0; i<s.length(); i++){

            if(s.charAt(i) == w) {
                word = i;
            }
            System.out.println("i = "+i +" / word = " +word);
            sd[i] = i-word;
        }
        word = 1000;
        for(int i = s.length()-1; i>=0;  i--){
            if(s.charAt(i) == w){
                word = i;
            }
            int tmp = word - i;

            if(sd[i]>tmp || sd[i] < 0){
                sd[i] = tmp;
            }
        }
        String answer = "";
        for(int i =0; i<sd.length; i++){
            if(i != sd.length-1){
                answer += sd[i]+",";
            }else{
                answer += sd[i];
            }
        }

        return sd;
    }

    public static void main(String[] args) {
        StrDistance obj = new StrDistance();
        int[] answer = obj.solution("kimkyuhyeong", 'k');
        for(int x : answer){
            System.out.print(x+" ");
        }

        System.out.println(answer);
    }
}
