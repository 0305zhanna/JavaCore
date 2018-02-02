package codingbat.Array2.lucky13;

public class Solution {
    public boolean lucky13(int[] nums) {
        if(nums.length<1) return true;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1 || nums[i] == 3) return false;
        }
        return true;
    }
}
