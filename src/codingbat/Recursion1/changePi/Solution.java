package codingbat.Recursion1.changePi;

public class Solution {
    public String changePi(String str) {
        if(str.length() <=0) return str;
        return (str.startsWith("pi")) ? "3.14"+changePi(str.substring(2)) : str.charAt(0) + changePi(str.substring(1));
    }
}
