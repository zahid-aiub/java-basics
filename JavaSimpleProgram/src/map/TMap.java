package map;

import java.util.HashMap;
import java.util.Map;

public class TMap {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("abc", 1);
        map.put("abc", 2);
        map.put(null, null);
        map.put(null, 56);

        System.out.println(map.get(null));

    }
}
