package codingbat.Warmup2.has271;

public class Solution {
    public boolean has271(int[] nums) {
        if(nums.length<=2) return false;
        for (int i = 0; i < nums.length - 2; i++) {
            if(nums[i+1]==nums[i]+5 && Math.abs(nums[i]-1 - nums[i+2])<=2 )
                return true;
        }
        return false;
    }
}
