package codingbat.Warmup2.altPairs;

public class Solution {
    public String altPairs(String str) {
        if(str.length()<=2) return str;
        String res = "";
        int step = 1;
        int i = 0;
        while (i <str.length()){
            res+=str.charAt(i);
            i+=step;
            step = (step==1)?3:1;
        }
        return res;
    }
}
