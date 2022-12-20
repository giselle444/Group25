package Group25.Rreze;

import java.util.*;

public class ArrayList_RemoveSomeValues {
    public static void main(String[] args) {

    }
    public static void removeSomeValuesSolution1(){
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        ArrayList<Integer> list2 = new ArrayList<>();

        for(int  each : list1)

            if( each < 100)

                list2.add(each);

        list1=list2;

        System.out.println(list1);

    }
    public static void removeSomeValuesSolution2(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        Iterator<Integer> it = list.iterator();

        while(it.hasNext())

            if(it.next()>100)

                it.remove();

        System.out.println(list);
    }

    public static void removeSomeValuesSolution3(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        for(ListIterator<Integer> il = list.listIterator(); il.hasNext();)

            if(il.next()>100)

                il.remove();

        System.out.println(list);
    }
    public static void removeSomeValuesSolution4(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        list.removeIf(p -> p>100);

        System.out.println(list);
    }
}
