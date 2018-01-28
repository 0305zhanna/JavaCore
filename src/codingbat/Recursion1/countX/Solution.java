package codingbat.Recursion1.countX;

public class Solution {
    public int countX(String str) {
        if(str.length() == 0) return 0;
        return (str.startsWith("x")) ? 1 + countX(str.substring(1,str.length())) : countX(str.substring(1,str.length()));
    }
}
