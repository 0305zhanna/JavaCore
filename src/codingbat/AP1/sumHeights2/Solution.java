package codingbat.AP1.sumHeights2;

public class Solution {
    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            int k = heights[i + 1] - heights[i];
            sum += (k > 0) ? 2 * k : Math.abs(k);
        }
        return sum;

    }
}
