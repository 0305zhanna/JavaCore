package codingbat.Warmup2.arrayFront9;

public class Solution {
    public boolean arrayFront9(int[] nums) {
        if(nums.length<=4){
            for (int i=0;i<nums.length;i++) {
                if(nums[i]==9) return true;
            }
        }else {
            for (int i=0;i<4;i++) {
                if(nums[i]==9) return true;
            }
        }
        return false;
    }
}
