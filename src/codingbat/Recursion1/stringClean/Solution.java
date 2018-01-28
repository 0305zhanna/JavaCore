package codingbat.Recursion1.stringClean;

public class Solution {
    public String stringClean(String str) {
        if(str.length()<=1) return str;
        return (str.charAt(0)==str.charAt(1)) ? stringClean(str.substring(1)):str.charAt(0)+stringClean(str.substring(1));
    }
}
