package codingbat.Map2.firstSwap;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String key = String.valueOf(strings[i].charAt(0));
            if (map.containsKey(key)){
                Integer index = map.get(key);
                if(index == -1)
                    continue;
                String value = strings[index];
                strings[index] = strings[i];
                strings[i] = value;
                map.put(key, -1);
            } else{
                map.put(key, i);
            }
        }
        return strings;
    }
}
