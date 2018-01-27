package codingbat.Recursion2.groupSumClump;

public class Solution {
    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) return (target == 0);
        int count = 1;
        for (int i = start; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1])
                count++;
            else break;
        }
        if(count > 1) {
            if(groupSumClump(start + count, nums, target - count * nums[start])) return true;
            else return groupSumClump(start + count, nums, target);
        }
        if (groupSumClump(start + 1, nums, target - nums[start])) return true;
        return groupSumClump(start + 1, nums, target);
    }
}
