package codingbat.Map2.wordLen;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if(!map.containsKey(strings[i])){
                map.put(strings[i],strings[i].length());
            }
        }
        return map;
    }
}
