package Group25.Giselle;

public class OddOrEven {
     /*
        1. Numbers -- odd & even
        Write  a method which can identifies given number is even or oddd
         */

    public static void main(String[] args) {

        System.out.println(oddEven(7));
    }
    public static String oddEven(int number){

        String num="";
        if (number % 2==0){
            return num="even";
        }else {
            return num="odd";
        }
    }
}


