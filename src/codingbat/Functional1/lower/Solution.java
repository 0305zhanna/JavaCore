package codingbat.Functional1.lower;

import java.util.List;

public class Solution {
    public List<String> lower(List<String> strings) {
        strings.replaceAll(s -> s.toLowerCase());
        return strings;
    }

}
