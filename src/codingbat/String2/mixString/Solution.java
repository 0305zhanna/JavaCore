package codingbat.String2.mixString;

public class Solution {
    public String mixString(String a, String b) {
        if(a.length() == 0) return b;
        if(b.length() == 0) return a;
        int min = (a.length() < b.length()) ? a.length() : b.length();
        String s = "";
        for (int i = 0; i < min; i++) {
            s += a.charAt(i);
            s += b.charAt(i);
        }
        s += (a.length() > b.length()) ? a.substring(min) : b.substring(min);
        return s;
    }
}
