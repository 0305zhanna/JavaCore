package codingbat.Warmup2.array123;

public class Solution {
    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if(nums[i]==1 && nums[i+1]==2&&nums[i+2]==3) return true;
        }
        return false;
    }
}
