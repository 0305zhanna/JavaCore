package codingbat.String2.prefixAgain;

public class Solution {
    public boolean prefixAgain(String str, int n) {
        String pref = str.substring(0,n);
        boolean b = false;
        for (int i = pref.length(); i <= str.length() - pref.length(); i++) {
            if(str.substring(i).startsWith(pref)){
                b= true;
                break;
            }
        }
        return b;
    }
}
