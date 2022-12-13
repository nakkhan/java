package Assignment4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Set {

    public static void main(String args[]) {

        java.util.Set<Integer> set1 = new LinkedHashSet<Integer>();

        set1.add(21);
        set1.add(23);
        set1.add(23);
        set1.add(28);
        set1.add(19);
        System.out.println(set1);


    }
}
