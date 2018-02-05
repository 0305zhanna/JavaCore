package codingbat.AP1.scoresSpecial;

public class Solution {
    public int scoresSpecial(int[] a, int[] b) {
        return largestScore(a) + largestScore(b);
    }

    int largestScore(int scores[]) {
        int largestScore = 0;
        for (int i : scores) {
            if (i % 10 == 0 && i > largestScore)
                largestScore = i;
        }
        return largestScore;
    }
}
