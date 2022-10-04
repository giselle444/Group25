package src.Group25.Faramoz;

public class EvenOdds {


        /**
         * Numbers -- odd & even
         * Write  a method which can identifies given number is even or odd
         */
        public static int identify(int num) {

            if (num % 2 == 0) {
                System.out.println("Even");

            } else {
                System.out.println("Odd");
            }

            return num;
        }

        public static void main(String[] args) {
            identify(6);
            identify(7);
        }

    }




