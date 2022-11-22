package Group25.Rreze;

public class SumOfDigitsSolution1 {
    public static void main(String[] args) {
        System.out.println(sumOfDigits("ABC123"));
    }
    public  static int  sumOfDigits(String s) {

        int total = 0;

        char[] ch =  s.toCharArray();

        for(char each: ch) {

            if(Character.isDigit(each)) {

                total += Integer.valueOf(""+each);

            }

        }

        return total;

    }
}
