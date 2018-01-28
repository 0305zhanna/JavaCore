package codingbat.Recursion1.strCopies;

public class Solution {
    public boolean strCopies(String str, String sub, int n) {
        if(str.length()<=0) return n==0;
        return (str.startsWith(sub)) ? strCopies(str.substring(1),sub,n-1):strCopies(str.substring(1),sub,n);
    }
}
