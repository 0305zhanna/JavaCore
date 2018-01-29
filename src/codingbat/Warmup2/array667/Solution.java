package codingbat.Warmup2.array667;

public class Solution {
    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            count = (nums[i] == 6) ? (nums[i + 1] == 6 || nums[i + 1] == 7) ? count + 1 : count : count;
        }
        return count;
    }
}
