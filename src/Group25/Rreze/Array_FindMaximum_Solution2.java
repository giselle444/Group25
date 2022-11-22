package Group25.Rreze;

import java.util.Arrays;

public class Array_FindMaximum_Solution2 {
    public static void main(String[] args) {
        System.out.println(maxValue(new int[]{1, 2, 9, 7, 5, 3, 6900}));
    }

    public static int maxValue( int[]  n ) {

        Arrays.sort( n );

        return  n [ n.length-1 ];

    }
}
