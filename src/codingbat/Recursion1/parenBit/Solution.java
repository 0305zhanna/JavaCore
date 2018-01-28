package codingbat.Recursion1.parenBit;

public class Solution {
    public String parenBit(String str) {
        if (str.length() <= 0) return str;
        return (!str.startsWith("(")) ? parenBit(str.substring(1)) : (!str.endsWith(")")) ? parenBit(str.substring(0, str.length() - 1)) : str;
    }
}
