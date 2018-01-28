package codingbat.Recursion1.pairStar;

public class Solution {
    public String pairStar(String str) {
        if (str.length() <= 1) return str;
        return (str.charAt(0) == str.charAt(1)) ? str.charAt(0) + "*" + pairStar(str.substring(1)) : str.charAt(0) + pairStar(str.substring(1));
    }
}
