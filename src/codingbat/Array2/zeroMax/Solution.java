package codingbat.Array2.zeroMax;

public class Solution {
    public int[] zeroMax(int[] nums) {
        int largestOdd = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 == 1 && nums[i] > largestOdd)
                largestOdd = nums[i];
            if (nums[i] == 0)
                nums[i] = largestOdd;
        }
        return nums;
    }
}
