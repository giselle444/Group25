package Group25.Rreze;

public class Numbers_PrimeNumber {
    public static void main(String[] args) {

    }
    public static boolean primeNumber(int num) {

        if(num <= 1){
            return false;
        }

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;

    }
}
