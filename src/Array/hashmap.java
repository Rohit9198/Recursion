package Array;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer>map = new HashMap<>();

        map.put("Kunal", 89);
        map.put("Karan", 99);
        map.put("Rohit", 94);

        System.out.println(map.get("Karan"));

    }
}
