package src.Group25.Faramoz;

/**
 2.Numbers -- Divide without / operator
 Write a method that can divide two numbers without using division operator.
 */

    public class Divide {
        public static int divide(int numOne, int numTow) {

            int result = 0;

            while (numOne >= numTow) {

                numOne -= numTow;
                result++;
            }
            return result;
        }


        public static void main(String[] args) {
            System.out.println(divide(200, 20));


        }}

