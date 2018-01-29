package codingbat.Warmup2.noTriples;

public class Solution {
    public boolean noTriples(int[] nums) {
        if(nums.length<=2) return true;
        for (int i = 0; i < nums.length - 2; i++)
            if(nums[i] == nums[i+1] && nums[i+1]==nums[i+2])
                return false;

        return true;
    }
}
