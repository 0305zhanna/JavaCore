package codingbat.Functional1.copies3;

import java.util.List;

public class Solution {
    public List<String> copies3(List<String> strings) {
        strings.replaceAll(s -> s + s + s);
        return strings;
    }
}
