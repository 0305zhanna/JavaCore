package codingbat.Array2.more14;

public class Solution {
    public boolean more14(int[] nums) {
        int ones = 0;
        int fours = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1) ones++;
            if(nums[i]==4) fours++;
        }
        return ones>fours;
    }
}
