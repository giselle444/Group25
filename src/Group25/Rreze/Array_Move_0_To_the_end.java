package Group25.Rreze;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_Move_0_To_the_end {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeros(new int[]{1, 0, 2, 0, 3, 0, 4, 0})));
    }
    public static int[] moveZeros( int[]  arr ) {

        ArrayList<Integer> list = new ArrayList<>();

        int countZero = 0;

        for(int each: arr) {

            list.add(each);

            countZero+= (each==0)?1:0;

        }



        list.removeAll(Arrays.asList(0));

        arr = new int[arr.length];

        for(int i=0; i <arr.length-countZero; i++ ) {

            arr[i] = list.get(i);

        }

        return arr;

    }
}
