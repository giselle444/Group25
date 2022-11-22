package Group25.Rreze;

public class ReverseSolution1 {
    public static void main(String[] args) {
        System.out.println(strReverse("abcdefg"));
    }

    public static String strReverse(String str) {

        String reverse="";

        for(int i=str.length()-1; i >= 0; i--)

            reverse += str.toCharArray()[i];



        return  reverse;

    }
}
