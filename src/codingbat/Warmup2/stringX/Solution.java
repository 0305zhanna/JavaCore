package codingbat.Warmup2.stringX;

public class Solution {
    public String stringX(String str) {
        if (str.length() <= 2) return str;
        int i = 1;
        while(i<str.length()-1) {
            if(str.charAt(i) == 'x'){
                str = str.substring(0,i)+str.substring(i+1,str.length());
            }else {
                i++;
            }
        }
        return str;
    }
}
