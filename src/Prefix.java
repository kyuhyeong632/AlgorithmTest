public class Prefix {

    public String solution(String[] strs){
        String answer = "";

        String ptCheck = strs[0];
        String[] pattern = new String[ptCheck.length()];
        String tmp = "";
        for(int i = 0; i< ptCheck.length(); i++){
            tmp = tmp + ptCheck.charAt(i);
            pattern[i] = tmp;
            System.out.println("i = " + tmp);
        }

        for(int i = 0; i<strs.length; i++){

        }

        return answer;
    }

    public static void main(String[] args) {
        Prefix obj = new Prefix();

        String[] stst = {"flower", "flow", "flight"};


        System.out.println(obj.solution(stst));

    }
}
