package codingbat.string1.hasBad;

public class Solution {
    public static boolean hasBad(String str) {
        if(str.length()<3)
            return false;
        if(str.startsWith("bad"))
            return true;
        String s = str.substring(1);
        if(s.startsWith("bad"))
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasBad("badxx"));
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxbadxx"));
        System.out.println(hasBad(""));
    }
}
