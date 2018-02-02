package codingbat.Array2.bigDiff;

public class Solution {
    public int bigDiff(int[] nums) {
        if (nums.length < 2) return 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        return max-min;
    }
}
