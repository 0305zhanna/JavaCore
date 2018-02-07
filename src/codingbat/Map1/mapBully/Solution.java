package codingbat.Map1.mapBully;

import java.util.Map;

public class Solution {
    public Map<String, String> mapBully(Map<String, String> map) {
        if(map.containsKey("a")){
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }
}
