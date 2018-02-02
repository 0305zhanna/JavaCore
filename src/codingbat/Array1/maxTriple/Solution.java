package codingbat.Array1.maxTriple;

public class Solution {
    public int maxTriple(int[] nums) {
        if (nums.length < 2) return nums[0];
        int max = (nums[0] > nums[nums.length - 1]) ? nums[0] : nums[nums.length - 1];
        max = (nums[nums.length / 2] > max) ? nums[nums.length / 2] : max;
        return max;
    }
}
