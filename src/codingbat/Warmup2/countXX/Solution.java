package codingbat.Warmup2.countXX;

public class Solution {
    int countXX(String str) {
        if(str.length() <= 1 ) return 0;
        return (str.startsWith("xx")) ? 1+countXX(str.substring(1)):countXX(str.substring(1));
    }
}
