package codingbat.Warmup2.doubleX;

public class Solution {
    boolean doubleX(String str) {
        boolean b = false;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i)=='x'){
                b = (str.charAt(i+1)=='x');
                break;
            }
        }
        return b;
    }
}
