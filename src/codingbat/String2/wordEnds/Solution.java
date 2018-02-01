package codingbat.String2.wordEnds;

public class Solution {
    public String wordEnds(String str, String word) {
        String res = "";
        int n = str.indexOf(word);
        while (n != -1) {
            if (n != 0) res += str.charAt(n - 1);
            if (n + word.length() == str.length()) break;
            res += str.charAt(n + word.length());
            n = str.indexOf(word, n + 1);
        }
        return res;
    }
}
