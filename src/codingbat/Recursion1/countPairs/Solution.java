package codingbat.Recursion1.countPairs;

public class Solution {
    public int countPairs(String str) {
        if(str.length()<3) return 0;
        return (str.charAt(0) == str.charAt(2)) ? 1+countPairs(str.substring(1)) : countPairs(str.substring(1));
    }
}
