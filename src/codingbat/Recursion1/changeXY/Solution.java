package codingbat.Recursion1.changeXY;

public class Solution {
    public String changeXY(String str) {
        if (str.length() <= 0) return str;
        return (str.startsWith("x")) ? "y" + changeXY(str.substring(1)) : str.charAt(0) + changeXY(str.substring(1));
    }
}
