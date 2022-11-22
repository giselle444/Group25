package Group25.Rreze;

import java.util.ArrayList;
import java.util.Arrays;

public class SortDescendingSolution1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{3, 45, 6, 7, 8, 432, 56})));
    }
    public static int[] sort(int[] a) {

        ArrayList<Integer> list=new ArrayList<Integer>();

        for(int each: a)

            list.add(each);



        for(int i=0; i < a.length; i++) {

            a[i] = findMax(list);

            list.remove(Integer.valueOf(a[i]));

        }

        return a;

    }



    public static int findMax(ArrayList<Integer> a) {

        int max=Integer.MIN_VALUE;

        for(int each: a)

            max = Math.max(max, each);

        return max;

    }
}
