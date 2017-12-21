package codingbat.string1.conCat;

public class Solution {
    public static String conCat(String a, String b) {
        if(a.length()<=0)
            return b;
        if(b.length()<=0)
            return a;
        if(a.endsWith(b.substring(0,1)))
            return a+b.substring(1);
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(conCat("abc", "cat"));
        System.out.println(conCat("dog", "cat"));
        System.out.println(conCat("abc", ""));
    }
}
