package codingbat.Array2.no14;

public class Solution {
    public boolean no14(int[] nums) {
        if (nums.length < 1) return true;
        int ones = 0;
        int fours = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) ones++;
            if (nums[i] == 4) fours++;
        }
        return ones == 0 || fours == 0;
    }
}
