package codingbat.Array2.sum67;

public class Solution {
    public int sum67(int[] nums) {
        if(nums.length<1) return 0;
        boolean take = true;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==6){
                take = false;
                continue;
            }
            if(take)
                sum+=nums[i];
            if(nums[i] == 7){
                take = true;
                continue;
            }
        }
        return sum;
    }
}