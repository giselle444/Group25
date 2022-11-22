package Group25.Rreze;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesSolution2 {
    public static void main(String[] args) {
        System.out.println(removeDup("aaaabbbbcccvdvdd"));
    }
    public static String removeDup(String str) {

        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();

        str = str.replace(", " ,  "" ).replace("[","").replace("]","");

        return  str;

    }
}
