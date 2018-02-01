package codingbat.String2.xyzThere;

public class Solution {
    public boolean xyzThere(String str) {
        if (str.length() <= 1) return false;
        if(str.startsWith("xyz")) return true;
        boolean b = false;
        for (int i = 1; i < str.length() - 2; i++) {
            if(str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'z'){
                b = (str.charAt(i - 1) != '.');
            }
        }
        return b;
    }
}
