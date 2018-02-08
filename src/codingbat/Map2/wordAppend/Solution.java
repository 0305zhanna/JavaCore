package codingbat.Map2.wordAppend;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        String res = "";
        for (int i = 0; i < strings.length; i++) {
            if(map.containsKey(strings[i])){
                map.put(strings[i], map.get(strings[i])+1);
                if(map.get(strings[i]) % 2==0)
                    res += strings[i];
            }else {
                map.put(strings[i], 1);
            }
        }
        return res;
    }
}
