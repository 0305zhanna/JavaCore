package codingbat.String3.countTriple;

public class Solution {
    public int countTriple(String str) {
        if (str.length() < 3) return 0;
        int tripleNumbers = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i + 1) == str.charAt(i) && str.charAt(i + 2) == str.charAt(i))
                tripleNumbers++;
        }
        return tripleNumbers;
    }
}
