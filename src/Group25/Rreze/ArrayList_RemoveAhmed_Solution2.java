package Group25.Rreze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_RemoveAhmed_Solution2 {
    public static void main(String[] args) {

    }
    public static void removeAhmed(){
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        for(ListIterator<String> it = names.listIterator(); it.hasNext();)

            if(it.next().equals("Ahmed"))

                it.remove();



        System.out.println(names);
    }
}
