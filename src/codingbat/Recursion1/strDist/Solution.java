package codingbat.Recursion1.strDist;

public class Solution {
    public int strDist(String str, String sub) {
        if(str.length()<sub.length()) return 0;
        return (str.startsWith(sub) && str.endsWith(sub)) ? str.length() : (str.startsWith(sub)) ? strDist(str.substring(0,str.length()-1),sub) :  strDist(str.substring(1),sub);
    }
}
