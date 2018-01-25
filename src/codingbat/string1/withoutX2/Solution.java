package codingbat.string1.withoutX2;

public class Solution {
    public String withoutX2(String str) {
        if(str.startsWith("x")){
            str = str.substring(1,str.length());
            if(str.startsWith("x")){
                str = str.substring(1,str.length());
            }
        } else {
            if(str.length() < 2)
                return str;
            if(str.charAt(1) == 'x')
                str = str.charAt(0)+str.substring(2,str.length());
        }
        return str;
    }
}
