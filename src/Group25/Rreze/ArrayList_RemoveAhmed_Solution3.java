package Group25.Rreze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayList_RemoveAhmed_Solution3 {
    public static void main(String[] args) {

    }
    public static void removeAhmed(){
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

                Iterator<String> it = names.iterator();

        while(it.hasNext()) {

            if(it.next().equals("Ahmed"))

                it.remove();

        }

        System.out.println( names );
    }
}
