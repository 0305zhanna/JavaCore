package codingbat.AP1.scoresAverage;

public class Solution {
    public int scoresAverage(int[] scores) {
        int av1 = average(scores, 0, scores.length / 2);
        int av2 = average(scores, scores.length / 2, scores.length);
        return (av1 > av2) ? av1 : av2;
    }

    int average(int[] scores, int start, int end) {
        int sum = 0;
        int count = end - start;
        for (int i = start; i < end; i++) {
            sum += scores[i];
        }
        return sum / count;
    }
}
