package codingbat.Functional2.noLong;

import java.util.List;

public class Solution {
    public List<String> noLong(List<String> strings) {
        strings.removeIf(s -> s.length() > 3);
        return strings;
    }
}
