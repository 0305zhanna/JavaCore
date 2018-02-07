package codingbat.String3.sameEnds;

public class Solution {
    public String sameEnds(String string) {
        String s = "";
        for (int i = 0; i < string.length() / 2; i++) {
            for (int j = string.length() / 2; j < string.length(); j++) {
                if(string.substring(0,i+1).equals(string.substring(j)))
                    s = string.substring(0,i+1);
            }
        }
        return s;
    }
}
