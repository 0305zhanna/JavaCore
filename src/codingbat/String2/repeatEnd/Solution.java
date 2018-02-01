package codingbat.String2.repeatEnd;

public class Solution {
    public String repeatEnd(String str, int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s += str.substring(str.length()-n);
        }
        return s;
    }
}
