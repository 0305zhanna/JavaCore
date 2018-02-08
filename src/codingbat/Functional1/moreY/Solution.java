package codingbat.Functional1.moreY;

import java.util.List;

public class Solution {
    public List<String> moreY(List<String> strings) {
        strings.replaceAll(s -> "y" + s + "y");
        return strings;
    }
}
