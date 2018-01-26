package codingbat.Recursion2.groupSum6;

public class Solution {
    public boolean groupSum6(int start, int[] nums, int target) {
        if(target == 0)
            return true;
        if(start >= nums.length)
            return false;
        if(nums[start] == 6)
            return groupSum6(start+1, nums, target-nums[start]);
        else
            return groupSum6(start+1, nums, target-nums[start]) || groupSum6(start+1, nums, target);
    }
}
