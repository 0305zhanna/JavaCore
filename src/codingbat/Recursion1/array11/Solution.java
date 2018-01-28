package codingbat.Recursion1.array11;

public class Solution {
    public int array11(int[] nums, int index) {
        if (index >= nums.length) return 0;
        return (nums[index] == 11) ? 1 + array11(nums, index + 1) : array11(nums, index + 1);
    }
}
