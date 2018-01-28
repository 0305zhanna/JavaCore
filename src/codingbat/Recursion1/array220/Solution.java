package codingbat.Recursion1.array220;

public class Solution {
    public boolean array220(int[] nums, int index) {
        if(index >= nums.length-1) return false;
        return (nums[index]*10 == nums[index+1]) ? true : array220(nums,index+1);
    }
}
