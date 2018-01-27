package codingbat.Recursion2.groupNoAdj;

public class Solution {
    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (target == 0) return true;
        if (start >= nums.length)
            return target == 0;
        return groupNoAdj(start + 2, nums, target - nums[start]) || groupNoAdj(start + 1, nums, target);
    }
}
