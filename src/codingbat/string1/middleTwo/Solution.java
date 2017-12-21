package codingbat.string1.middleTwo;

public class Solution {
    public static String middleTwo(String str) {
        if(str.length()<=2)
            return str;
        return str.substring(str.length()/2-1,str.length()/2+1);
    }

    public static void main(String[] args) {
        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("code"));
        System.out.println(middleTwo("Practice"));
    }
}
