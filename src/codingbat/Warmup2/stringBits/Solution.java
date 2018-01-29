package codingbat.Warmup2.stringBits;

public class Solution {
    public String stringBits(String str) {
        if(str.length()<2) return str;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i+=2) {
            s.append(str.charAt(i));
        }
        return s.toString();
    }
}
