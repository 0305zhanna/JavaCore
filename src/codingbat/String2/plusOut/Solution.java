package codingbat.String2.plusOut;

public class Solution {
    public String plusOut(String str, String word) {
        int s = 0;
        int n = str.indexOf(word);
        while (n != -1) {
            for (int i = s; i < n; i++) {
                str = str.substring(0, i) + "+" + str.substring(i + 1);
            }
            s = n + word.length();
            n = str.indexOf(word, s);
        }
        for (int i = s; i < str.length(); i++) {
            str = str.substring(0, i) + "+" + str.substring(i + 1);
        }
        return str;
    }
}
