import java.util.*;
public class Main {
    /*public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(str)  ;
    }*/

    /*String to Num Main
    public static void main(String[] args){
        StringToNum STN = new StringToNum();
        System.out.print(STN.solution("12onezero"));
    }*/

    /* Finding Kim Seobang in Seoul */
    public static void main(String[] args){
        FindKimInSeoul STN = new FindKimInSeoul();
        String[] seoul = {"Jeong", "Seo", "Ha", "Lee", "Kim", "Yoon"};
        System.out.print(STN.findKimInSeoul(seoul));

    }


}
