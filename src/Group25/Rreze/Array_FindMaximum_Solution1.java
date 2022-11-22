package Group25.Rreze;

public class Array_FindMaximum_Solution1 {
    public static void main(String[] args) {
        System.out.println(maxValue(new int[]{2, 5, 9, 7, 20}));
    }

    public static int maxValue( int[]  n ) {

        int max = Integer.MIN_VALUE;

        for(int each: n)

            if(each > max)

                max = each;



        return max;

    }
}
