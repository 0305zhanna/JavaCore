package codingbat.String3.mirrorEnds;

public class Solution {
    public String mirrorEnds(String string) {
        String s = "";
        int ind1 = 0;
        int ind2 = string.length()-1;
        while (ind1 < string.length() && ind2 >= 0) {
            if(string.charAt(ind1) == string.charAt(ind2)){
                s += string.charAt(ind1);
                ind1++;
                ind2--;
            }else
                break;
        }
        return s;
    }
}
