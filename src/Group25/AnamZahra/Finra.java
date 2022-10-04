package Group25.AnamZahra;

public class Finra {
    public static void finra(){
        for(int num = 1; num <= 30; num++){
            if(num % 3 == 0 && num % 5 == 0){
                System.out.print("FINRA, ");
            }else if(num % 5 == 0){
                System.out.print("RA, ");
            }else if(num % 3 == 0) {
                System.out.print("FIN, ");
            } else {
                System.out.print(num + " ,");
            }}}
    public static void main(String[] args) {
        finra();
    }
}
