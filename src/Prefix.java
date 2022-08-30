public class Prefix {

    public String solution(String[] strs){


        StringBuilder sb = new StringBuilder();

        int mini = 201;

        for(String str : strs){
            mini = Math.min(mini, str.length());

            for(int i = 0; i<mini; i++){
                char ch = str.charAt(i);
                for(int j = 1; j< strs.length; j++){
                    if(ch != strs[j].charAt(i)){
                        return sb.toString();
                    }
                }
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Prefix obj = new Prefix();

        String[] stst = {"flower", "flow", "flight"};


        System.out.println(obj.solution(stst));

    }
}
