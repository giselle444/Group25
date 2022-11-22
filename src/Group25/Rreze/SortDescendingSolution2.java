package Group25.Rreze;

import java.util.ArrayList;
import java.util.Arrays;

public class SortDescendingSolution2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortingArrayDesc(new int[]{8, 7, 5, 3, 4, 2, 0, 1, 5200})));
    }
    public static int[] sortingArrayDesc(int[] arr) {

        ArrayList<Integer> list = new ArrayList();

        for(int each: arr) {

            list.add(each);

        }

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) > list.get(j)) {

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
