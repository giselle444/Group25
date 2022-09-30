package Group25;

public class DivideWithoutOperator {
    /*
2.Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.
 */
    public static void main(String[] args) {
        System.out.println(division(20,5));
    }
    public static int division(int dividend, int divisor){
        //     10/2
        int result=0;

        while(dividend >= divisor){
            dividend= dividend-divisor;
            result++;
        }
        return result;
    }
}
