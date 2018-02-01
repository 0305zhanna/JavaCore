package codingbat.String2.bobThere;

public class Solution {
    public boolean bobThere(String str) {
        if (str.length() <= 1) return false;
        for (int i = 0; i < str.length() - 2; i++)
            if(str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
                return true;
        return false;
    }
}
