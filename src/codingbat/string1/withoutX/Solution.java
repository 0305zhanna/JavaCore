package codingbat.string1.withoutX;

public class Solution {
    public String withoutX(String str) {
        if(str.startsWith("x")){
            str = str.substring(1,str.length());
        }
        if (str.endsWith("x")){
            str = str.substring(0, str.length()-1);
        }
        return str;
    }
}
