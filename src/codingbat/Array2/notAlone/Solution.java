package codingbat.Array2.notAlone;

public class Solution {
    public int[] notAlone(int[] nums, int val) {
        if (nums.length < 3) return nums;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && (nums[i - 1] != val && nums[i + 1] != val))
                nums[i] = (nums[i + 1] > nums[i - 1]) ? nums[i + 1] : nums[i - 1];
        }
        return nums;
    }
}
