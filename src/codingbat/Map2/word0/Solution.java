package codingbat.Map2.word0;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if(!map.containsKey(strings[i])){
                map.put(strings[i],0);
            }
        }
        return map;
    }
}
