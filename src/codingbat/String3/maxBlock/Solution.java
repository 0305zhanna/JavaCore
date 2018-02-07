package codingbat.String3.maxBlock;

public class Solution {
    public int maxBlock(String str) {
        if(str.length()<1) return 0;
        char c = str.charAt(0);
        int count = 1;
        int max = count;
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == c){
                count++;
            }else {
                c = str.charAt(i);
                if(count>max)
                    max = count;
                count = 1;
            }
        }
        if(count>max)
            max = count;
        return max;
    }
}
