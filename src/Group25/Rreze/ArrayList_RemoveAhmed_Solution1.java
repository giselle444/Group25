package Group25.Rreze;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_RemoveAhmed_Solution1 {
    public static void main(String[] args) {
    removeAhmed();
    }
    public static void removeAhmed(){
    ArrayList <String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

            names.removeAll( Arrays.asList("Ahmed"));

    System.out.println(names);
}
}
