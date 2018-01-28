package codingbat.Recursion1.endX;

public class Solution {
    public String endX(String str) {
        if(str.length()<=0) return str;
        return (str.startsWith("x")) ? endX(str.substring(1))+"x" : str.charAt(0)+endX(str.substring(1));
    }
}
