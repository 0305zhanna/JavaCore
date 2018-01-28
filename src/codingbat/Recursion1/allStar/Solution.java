package codingbat.Recursion1.allStar;

public class Solution {
    public String allStar(String str) {
        if(str.length() <= 1) return str;
        return str.charAt(0)+"*"+allStar(str.substring(1));
    }
}
