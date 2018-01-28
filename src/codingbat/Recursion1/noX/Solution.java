package codingbat.Recursion1.noX;

public class Solution {
    public String noX(String str) {
        if(str.length()<=0) return str;
        return (str.startsWith("x")) ? noX(str.substring(1)) : str.charAt(0)+noX(str.substring(1));
    }
}
