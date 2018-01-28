package codingbat.Recursion1.countAbc;

public class Solution {
    public int countAbc(String str) {
        if(str.length()<3) return 0;
        return (str.startsWith("abc") || str.startsWith("aba")) ? 1+countAbc(str.substring(1)):countAbc(str.substring(1));
    }
}
