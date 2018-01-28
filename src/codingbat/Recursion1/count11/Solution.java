package codingbat.Recursion1.count11;

public class Solution {
    public int count11(String str) {
        if(str.length()<2) return 0;
        return (str.startsWith("11")) ? 1+count11(str.substring(2)) : count11(str.substring(1));
    }
}
