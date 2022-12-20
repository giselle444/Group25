package Group25.Rreze;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Map_MinValue {
    public static void main(String[] args) {

    }
    public  static  int  minValue( Map<String,Integer> map  ) {

        SortedSet<Integer> sm = new TreeSet<>(map.values());

        return sm.first( );

    }
}
