package codingbat.Array2.sum13;

public class Solution {
    public int sum13(int[] nums) {
        if (nums.length < 1) return 0;
        int sum = 0;
        if(nums[0] != 13) sum += nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 13) continue;
            if (nums[i-1] == 13) continue;
            sum += nums[i];
        }
        return sum;
    }
}
