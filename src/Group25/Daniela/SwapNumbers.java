package Group25.Daniela;

public class SwapNumbers {
    public static void main(String[] args) {
/*
 1. Numbers -- Swap Numbers
Swap two variable' values without using a third variable
 */

        System.out.println(swapNumber(12, 50));
    }

    private static String swapNumber(int x, int y) {

        String result = "";
        x = x + y;
        y = x - y;
        x = x - y;

        result = "After swapping:" + " x = " + x + ", y = " + y;

        return result;

    }
}
