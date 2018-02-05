package codingbat.AP1.wordsWithout;

public class Solution {
    public String[] wordsWithout(String[] words, String target) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target))
                count++;
        }
        String[] res = new String[count];
        int j = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                res[j] = words[i];
                j++;
            }
        }
        return res;
    }
}
