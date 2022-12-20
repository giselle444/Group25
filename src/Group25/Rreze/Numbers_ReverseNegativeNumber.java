package Group25.Rreze;

public class Numbers_ReverseNegativeNumber {
    public static void main(String[] args) {

    }
    public static int reverseNum(int  num) {

        String str = new StringBuilder(""+num).reverse().toString();

        if(num < 0) {

            str = "-"+str.substring(0, str.length()-1);

        }

        return Integer.valueOf(str);

    }
}
