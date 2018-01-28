package codingbat.Recursion1.strCount;

public class Solution {
    public int strCount(String str, String sub) {
        if(str.length()<= 0) return 0;
        return (str.startsWith(sub)) ? 1+strCount(str.substring(sub.length()),sub) : strCount(str.substring(1),sub);
    }
}
