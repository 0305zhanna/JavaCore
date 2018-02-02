package codingbat.Array2.only14;

public class Solution {
    public boolean only14(int[] nums) {
        if(nums.length<1) return true;
        for (int i = 0; i < nums.length; i++) {
            if(!(nums[i] != 1 ^ nums[i] != 4))
                return false;
        }
        return true;
    }
}
