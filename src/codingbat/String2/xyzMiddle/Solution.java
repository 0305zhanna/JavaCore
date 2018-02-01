package codingbat.String2.xyzMiddle;

public class Solution {
    public boolean xyzMiddle(String str) {
        if(str.length()<3) return false;
        if(str.length()%2!=0){
            int n = (str.length() - 3) / 2;
            if(str.substring(n).startsWith("xyz")) return true;
            return false;
        }else {
            int n = (str.length() - 3) / 2;
            if(str.substring(n).startsWith("xyz") || str.substring(n+1).startsWith("xyz")) return true;
            return false;
        }
    }
}
