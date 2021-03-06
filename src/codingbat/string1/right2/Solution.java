package codingbat.string1.right2;

public class Solution {
    public static String right2(String str) {
        if(str.length() <=2)
            return str;
        return str.substring(str.length()-2)+str.substring(0,str.length()-2);
    }

    public static void main(String[] args) {
        System.out.println(right2("Hello"));
        System.out.println(right2("java"));
        System.out.println(right2("Hi"));
    }
}
