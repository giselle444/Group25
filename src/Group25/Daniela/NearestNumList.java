package Group25.Daniela;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NearestNumList {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 5, 8, 9, 13, 21, 22, 25, 50));
        System.out.println(nearestNumber(14, numbers));
    }

    public static int nearestNumber(int target, List<Integer> numbers) {

        int nearestNum = 0;
        int nextNum;
        int prevNum;

        if (numbers.size() == 1) {
            System.out.println(numbers.get(0));
        }
        if (!numbers.contains(target)) {
            numbers.add(target);
            Collections.sort(numbers);

            for (int i = 0; i < numbers.size(); i++) {

                if (numbers.get(i) == target) {

                    nextNum = numbers.get(i + 1);
                    prevNum = numbers.get(i - 1);

                    if (Math.abs(target - prevNum) < Math.abs(nextNum - target)) {
                        nearestNum = prevNum;
                    } else {
                        nearestNum = nextNum;
                    }
                }
            }
        }
        return nearestNum;
    }
}
