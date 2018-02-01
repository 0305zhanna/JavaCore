package codingbat.String2.repeatSeparator;

public class Solution {
    public String repeatSeparator(String word, String sep, int count) {
        String s = "";
        for (int i = 0; i < count; i++) {
            s += word;
            s = (i != count - 1) ? s + sep : s;
        }
        return s;
    }
}
