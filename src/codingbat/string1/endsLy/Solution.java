package codingbat.string1.endsLy;

public class Solution {
    public static boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    public static void main(String[] args) {
        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
        System.out.println(endsLy("oddy"));
    }
}
