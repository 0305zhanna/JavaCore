package codingbat.String2.countCode;

public class Solution {
    public int countCode(String str) {
        if (str.length()<4) return 0;
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if(str.charAt(i)=='c'&&str.charAt(i+1)=='o'&&str.charAt(i+3)=='e')
                count++;
        }
        return count;
    }
}
