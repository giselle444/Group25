package Group25.Rreze;

public class Numbers_Finra {
    public static void main(String[] args) {

    }
    public static void FINRA() {

        String result = "";

        for(int i=1; i <= 30; i++) {

            result += (i % 5 ==0 && i %3 ==0)? "FINRA " : (i%5 == 0) ? "RA "

                    :(i%3 == 0) ? "FIN " : i+" ";

        }

        System.out.println(result);

    }
}
