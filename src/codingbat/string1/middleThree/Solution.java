package codingbat.string1.middleThree;

public class Solution {
    public static String middleThree(String str) {
        if(str.length()<=3)
            return str;
        return str.substring(str.length()/2-1,str.length()/2+2);
    }

    public static void main(String[] args) {
        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));
    }
}
