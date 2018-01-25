package codingbat.string1.without2;

public class Solution {
    public String without2(String str) {
        if(str.length()==2)
            return "";
        if(str.length()<2)
            return str;
        if(str.substring(0,2).equals(str.substring(str.length()-2,str.length())))
            return str.substring(2,str.length());
        return str;
    }
}
