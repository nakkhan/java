package Assignment4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Deque;
import java.util.PriorityQueue;

public class Queue {

    public static void  main(String args[]) {

        java.util.PriorityQueue<Integer> q = new PriorityQueue<Integer>();

        q.add(1);
        q.add(3);
        q.add(2);
        q.add(4);
      //  q.peek();
        //System.out.println(q.remove(3));
        System.out.println(q);

        Integer arr[]
                = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // print the original array
        System.out.println("Initial Array:\n"
                + Arrays.toString(arr));



    }
}
