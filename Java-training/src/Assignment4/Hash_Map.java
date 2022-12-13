package Assignment4;

import java.util.HashMap;

public class Hash_Map {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Java", 8);
        hm.put("JavaScript", 1);
        hm.put("Python", 3);
        hm.put("JavaScript", 2);
        System.out.println("HashMap: " + hm);
    }

}
