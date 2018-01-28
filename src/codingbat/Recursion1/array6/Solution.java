package codingbat.Recursion1.array6;

public class Solution {
    public boolean array6(int[] nums, int index) {
        if (index >= nums.length) return false;
        return (nums[index] == 6) ? true : array6(nums, index + 1);
    }
}
