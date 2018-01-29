package codingbat.Warmup2.stringSplosion;

public class Solution {
    public String stringSplosion(String str) {
        if(str.length()<=1) return str;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <= str.length(); i++) {
            s.append(str.substring(0,i));
        }
        return s.toString();
    }
}
