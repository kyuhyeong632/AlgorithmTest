import java.util.Arrays;

public class MultiplyStrings {

    public String multiply(String num1, String num2){
        String str = "";

        int multi = 0;
        int digit1 = 1;
        int digit2 = 1;

        for(int i = num1.length()-1; i >= 0; i-- ){
            int topNum = Character.getNumericValue(num1.charAt(i));
            for(int j = num2.length()-1; j>= 0; j--){
                int dNum = Character.getNumericValue(num2.charAt(j))*digit2;
                topNum *= digit1;
                multi += (topNum * dNum);
                digit1 *= 10;

            }
            digit1 = 1;
            digit2 *= 10;
        }

        str = Integer.toString(multi);

        return str;
    }

    public static void main(String[] args) {
        MultiplyStrings obj = new MultiplyStrings();
        String str1 = "123";
        String str2 = "456";

        System.out.println("str = " + obj.multiply(str1, str2));
    }
}
