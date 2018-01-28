package codingbat.Recursion1.countHi;

public class Solution {
    public int countHi(String str) {
        if(str.length() <= 0) return 0;
        return (str.startsWith("hi")) ? 1 + countHi(str.substring(2,str.length())) : countHi(str.substring(1,str.length()));
    }
}
