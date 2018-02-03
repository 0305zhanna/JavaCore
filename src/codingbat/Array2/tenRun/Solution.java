package codingbat.Array2.tenRun;

public class Solution {
    public int[] tenRun(int[] nums) {
        boolean b = false;
        int mult10 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                mult10 = nums[i];
                b = true;
            } else {
                if (b) {
                    nums[i] = mult10;
                }
            }
        }
        return nums;
    }
}
