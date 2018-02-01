package codingbat.Array1.maxEnd3;

public class Solution {
    public int[] maxEnd3(int[] nums) {
        int max = (nums[0]>nums[nums.length-1]) ? nums[0] : nums[nums.length-1];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = max;
        }
        return nums;
    }
}
