package codingbat.Recursion1.nestParen;

public class Solution {
    public boolean nestParen(String str) {
        if (str.length()<=0) return true;
        return (str.startsWith("(") && str.endsWith(")")) ? nestParen(str.substring(1,str.length()-1)) : false;
    }
}
