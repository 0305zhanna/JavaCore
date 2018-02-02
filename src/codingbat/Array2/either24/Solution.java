package codingbat.Array2.either24;

public class Solution {
    public boolean either24(int[] nums) {
        boolean b1 = false;
        boolean b2 = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 4 && nums[i+1] == 4) b1 = true;
            if (nums[i] == 2 && nums[i+1] == 2) b2 = true;
        }
        return b1 ^ b2;
    }
}
