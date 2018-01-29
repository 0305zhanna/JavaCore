package codingbat.Warmup2.stringMatch;

public class Solution {
    public int stringMatch(String a, String b) {
        if (a.length() <= 0 || b.length() <= 0) return 0;
        int min = (a.length() < b.length()) ? a.length() : b.length();
        int count = 0;
        for (int i = 0; i < min - 1; i++) {
            count = (a.substring(i, i + 2).equals(b.substring(i, i + 2))) ? count + 1 : count;
        }
        return count;
    }
}
