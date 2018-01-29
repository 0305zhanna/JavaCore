package codingbat.Warmup2.last2;

public class Solution {
    public int last2(String str) {
        if (str.length()<=2) return 0;
        String end = str.substring(str.length()-2, str.length());
        str = str.substring(0,str.length()-1);
        int count = 0;
        while (str.length()>0){
            if(str.startsWith(end)) count++;
            str = str.substring(1);
        }
        return count;
    }
}
