package Group25.Rreze;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_Sort_Ascending_Solution1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort((new int[]{5, 9, 7, 5, 3, 4, 7, 1, 2, 3}))));
    }
    public static int[] sort(int[] a) {

        ArrayList<Integer> list=new ArrayList<Integer>();

        for(int each: a)

            list.add(each);



        for(int i=0; i < a.length; i++) {

            a[i] = findMin(list);

            list.remove(Integer.valueOf(a[i]));

        }

        return a;

    }

    public static int findMin(ArrayList<Integer> a) {

        int min =Integer.MAX_VALUE;

        for(int each: a)

            min = Math.min(min, each);

        return min;

    }
}
