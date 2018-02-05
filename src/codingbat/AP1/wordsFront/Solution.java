package codingbat.AP1.wordsFront;

public class Solution {
    public String[] wordsFront(String[] words, int n) {
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = words[i];
        }
        return res;
    }
}
