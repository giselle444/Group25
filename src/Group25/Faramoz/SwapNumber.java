package src.Group25.Faramoz;

public class SwapNumber {

     /**
      1. Numbers -- Swap Numbers
      Swap two variable' values without using a third variable
      */

     public static void swap (int a, int b){



          a +=  b;
        //10 = 10 + 5 (a = 15 )
          b = a - b;
        //5 = 15 - 5 (b = 10)
          a -= b;
          // 15 = 15 - 10 (a 5)

          System.out.println(a);
          System.out.println(b);
     }


     public static void main(String[] args) {
          swap(10, 5);

     }
     }



