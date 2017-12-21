package codingbat.string1.lastChars;

public class Solution {
    public static String lastChars(String a, String b) {
        if(a.length() <=0 && b.length() <=0)
            return "@@";
        if(a.length() <=0)
            return "@"+b.substring(b.length()-1);
        if(b.length() <= 0)
            return a.substring(0,1)+"@";
        return a.substring(0,1)+b.substring(b.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));
        System.out.println(lastChars("hi", ""));
    }

}
