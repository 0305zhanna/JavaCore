package codingbat.string1.theEnd;

public class Solution {
    public static String theEnd(String str, boolean front) {
        if(front)
            return str.substring(0,1);
        else
            return str.substring(str.length()-1);

    }

    public static void main(String[] args) {
        System.out.println(theEnd("Hello", true));
        System.out.println(theEnd("Hello", false));
        System.out.println(theEnd("oh", true));
    }
}
