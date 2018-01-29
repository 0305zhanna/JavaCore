package codingbat.Warmup2.stringYak;

public class Solution {
    public String stringYak(String str) {
        if(str.length()<=2) return str;
        return (str.startsWith("yak")) ? stringYak(str.substring(3)) : str.charAt(0) + stringYak(str.substring(1));
    }
}
