package codingbat.Map1.mapShare;

import java.util.Map;

public class Solution {
    public Map<String, String> mapShare(Map<String, String> map) {
        map.remove("c");
        if(map.containsKey("a")){
            map.put("b", map.get("a"));
        }
        return map;
    }
}
