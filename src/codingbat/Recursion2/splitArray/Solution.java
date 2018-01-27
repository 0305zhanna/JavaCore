package codingbat.Recursion2.splitArray;

public class Solution {
    public boolean splitArray(int[] nums) {
        
    }
    int helper(int start, int end,int sum, int[] nums){
        if(start >= end) return sum;
        return helper(start+1, end,sum+nums[start],nums);
    }

}
