package codingbat.Recursion1.countHi2;

public class Solution {
    public int countHi2(String str) {
        if(str.length()<2) return 0;
        return (str.startsWith("xhi")) ? countHi2(str.substring(3)) : (str.startsWith("hi")) ? 1+countHi2(str.substring(2)) : countHi2(str.substring(1));
    }
}
