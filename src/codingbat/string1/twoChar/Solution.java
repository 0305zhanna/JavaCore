package codingbat.string1.twoChar;

public class Solution {
    public static String twoChar(String str, int index) {
        if(str.length()<=2)
            return str;
        if(index+2>str.length() || index<=0)
            return str.substring(0,2);
        return str.substring(index,index+2);
    }

    public static void main(String[] args) {
        System.out.println(twoChar("java", 0));
        System.out.println(twoChar("java", 2));
        System.out.println(twoChar("java", 3));
        System.out.println(twoChar("java", -1));
    }
}
