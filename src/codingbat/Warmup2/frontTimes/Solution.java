package codingbat.Warmup2.frontTimes;

public class Solution {
    public String frontTimes(String str, int n) {
        String str2 = "";
        if (str.length() <= 3) {
            for (int i = 0; i < n; i++) {
                str2 += str;
            }
        } else {
            String add = str.substring(0, 3);
            for (int i = 0; i < n; i++) {
                str2 += add;
            }
        }
        return str2;
    }
}
