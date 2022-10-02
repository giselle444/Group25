package Group25.Daniela;

public class NumbersDivisibleBy3_5_15 {
    public static void main(String[] args) {

        divisibleBy3_5_15();
    }

    public static void divisibleBy3_5_15(){

        String divisibleBy15 = "";
        String divisibleBy3 = "";
        String divisibleBy5 = "";

        for (int i = 1; i <= 100; i++) {

            if (i % 15 == 0) {
                divisibleBy15 += i + " ";

            } else if (i % 5 == 0) {
                divisibleBy5 += i + " ";

            }else if(i % 3 == 0){
                divisibleBy3 += i + " ";
            }
        }
        System.out.println("Numbers divisible by 15 " + divisibleBy15);
        System.out.println("Numbers divisible by 5 " + divisibleBy5);
        System.out.println("Numbers divisible by 3 " + divisibleBy3);
    }
}
