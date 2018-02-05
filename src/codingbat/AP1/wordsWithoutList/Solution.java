package codingbat.AP1.wordsWithoutList;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List wordsWithoutList(String[] words, int len) {
        List<String> res = new ArrayList<>();
        for (String s : words) {
            if (s.length() != len)
                res.add(s);
        }
        return res;
    }
}
