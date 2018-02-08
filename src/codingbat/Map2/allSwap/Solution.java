package codingbat.Map2.allSwap;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String key = String.valueOf(strings[i].charAt(0));
            if (map.containsKey(key)){
                Integer index = map.remove(key);
                String value = strings[index];
                strings[index] = strings[i];
                strings[i] = value;
            } else{
                map.put(key, i);
            }
        }
        return strings;
    }
}
