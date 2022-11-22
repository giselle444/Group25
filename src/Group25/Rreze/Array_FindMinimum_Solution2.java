package Group25.Rreze;

import java.util.Arrays;

public class Array_FindMinimum_Solution2 {
    public static void main(String[] args) {
        System.out.println(maxValue(new int[]{5, 9, 7, 8, 6, -7}));
    }
    public static int maxValue( int[]  n ) {

        Arrays.sort( n );

        return  n [ 0 ];

    }
}
