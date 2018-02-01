package codingbat.String2.countHi;

public class Solution {
    public int countHi(String str) {
        if(str.length()<=1) return 0;
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            count = (str.charAt(i)=='h' && str.charAt(i+1)=='i') ? count+1:count;
        }
        return count;
    }
}
