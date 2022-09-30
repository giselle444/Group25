package Group25.Daniela;

public class NotDivision {
    public static void main(String[] args) {

        System.out.println(division(40, 5));

    }

    public static int division(int dividend, int divisor) {

        int result = 0;

        //40        5
        while (dividend >= divisor) {
            dividend = dividend - divisor;
            result++;
        }
        return result;

    }
}
