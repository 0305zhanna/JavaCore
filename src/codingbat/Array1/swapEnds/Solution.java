package codingbat.Array1.swapEnds;

public class Solution {
    public int[] swapEnds(int[] nums) {
        if(nums.length<2) return nums;
        int i = nums[nums.length-1];
        nums[nums.length-1] = nums[0];
        nums[0]=i;
        return nums;
    }
}
