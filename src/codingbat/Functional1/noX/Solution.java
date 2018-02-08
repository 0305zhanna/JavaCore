package codingbat.Functional1.noX;

import java.util.List;

public class Solution {
    public List<String> noX(List<String> strings) {
        strings.replaceAll(s -> s.replaceAll("x", ""));
        return strings;
    }
}
