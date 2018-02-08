package codingbat.Map2.firstChar;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(String.valueOf(strings[i].charAt(0))))
                map.put(String.valueOf(strings[i].charAt(0)), map.get(String.valueOf(strings[i].charAt(0))) + strings[i]);
            else
                map.put(String.valueOf(strings[i].charAt(0)), strings[i]);
        }
        return map;
    }
}
