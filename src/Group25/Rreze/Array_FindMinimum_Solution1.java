package Group25.Rreze;

public class Array_FindMinimum_Solution1 {
    public static void main(String[] args) {
        System.out.println(minValue(new int[]{1, 5, 9, 7, -5}));
    }
    public static int minValue( int[]  n ) {

        int min = Integer.MAX_VALUE;

        for(int each: n)

            if(each < min)

                min = each;



        return min;

    }
}
