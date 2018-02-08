package codingbat.Map2.pairs;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            map.put(String.valueOf(strings[i].charAt(0)), String.valueOf(strings[i].charAt(strings[i].length() - 1)));
        }
        return map;
    }
}
