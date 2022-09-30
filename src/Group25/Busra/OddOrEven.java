package Group25.Busra;

import java.util.ArrayList;
import java.util.Arrays;

public class OddOrEven {
    public static void main(String[] args) {
//        int a = 1566984698;
//        System.out.println("Result for a = " + oddOrEven(a));

        ArrayList<Integer> list1 = new ArrayList<>(
                Arrays.asList(1,5,3,6,7,12,65,85,65,0,7)
        );
        System.out.println("list1 = " + list1);

        for (Integer each : list1) {
            System.out.println(oddOrEven(each));

        }}
    public static String oddOrEven(int x){
        String even = x + "  is an Even number!";
        String odd = x + " is an Odd number!";

        if(x % 2 == 0) {
            return even;
        }else {
            return odd;
        }
    }
}
