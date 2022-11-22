package Group25.Rreze;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySortAscendingSolution2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortingArrayAsc(new int[]{2, 3, 4, 5, 67, 8, 9, 5, -4})));
    }
    public static int[] sortingArrayAsc(int[] arr) {

        ArrayList<Integer> list = new ArrayList();

        for(int each: arr) {

            list.add(each);

        }

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);

                }

            }

        }

        for(int i=0; i < list.size(); i++) {

            arr[i] = list.get(i);

        }

        return arr;
    }
}
