package codingbat.Warmup2.stringTimes;

public class Solution {
    public String stringTimes(String str, int n) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            s.append(str);
        }
        return s.toString();
    }
}
