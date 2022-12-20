package Group25.Rreze;

import java.util.List;

public class ArrayList_SortingInAscending {
    public static void main(String[] args) {

    }
    public static void SortingArrayListAsc(List<Integer> list) {

        for (int i = 0; i < list.size(); i++){

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);

                }

            }

        }

    }
}
