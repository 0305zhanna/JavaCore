package codingbat.Functional1.addStar;

import java.util.List;

public class Solution {
    public List<String> addStar(List<String> strings) {
        strings.replaceAll(s -> s + "*");
        return strings;
    }
}
