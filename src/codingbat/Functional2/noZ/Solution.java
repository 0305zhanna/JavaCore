package codingbat.Functional2.noZ;

import java.util.List;

public class Solution {
    public List<String> noZ(List<String> strings) {
        strings.removeIf(s -> s.contains("z"));
        return strings;
    }
}
