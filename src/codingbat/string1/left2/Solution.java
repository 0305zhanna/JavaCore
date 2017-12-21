package codingbat.string1.left2;

public class Solution {
    public static String left2(String str) {
        if(str.length()<=2)
            return str;
        return str.substring(2)+str.substring(0,2);
    }

    public static void main(String[] args) {
        System.out.println(left2("Hello"));
        System.out.println(left2("java"));
        System.out.println(left2("Hi"));
    }
}
