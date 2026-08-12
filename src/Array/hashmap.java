package Array;

import java.util.HashMap;
import java.util.HashSet;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer>map = new HashMap<>();

        map.put("Kunal", 89);
        map.put("Karan", 99);
        map.put("Rohit", 94);

        //System.out.println(map.get("Karan"));
        //System.out.println(map.getOrDefault("Apoorv", 78));
        System.out.println(map.containsKey("Rohit"));

        HashSet<Integer> set = new HashSet<>();

        set.add(56);
        set.add(91);
        set.add(12);
        set.add(43);
        set.add(56);
        set.add(2);

        System.out.println(set);

    }
}
