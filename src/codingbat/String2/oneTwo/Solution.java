package codingbat.String2.oneTwo;

public class Solution {
    public String oneTwo(String str) {
        if(str.length()<3) return "";
        String s = "";
        int i = 0;
        while(i<str.length()-2) {
            s+=str.substring(i+1,i+3);
            s += str.charAt(i);
            i+=3;
        }
        return s;
    }
}
