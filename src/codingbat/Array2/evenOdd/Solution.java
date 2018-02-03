package codingbat.Array2.evenOdd;

public class Solution {
    public int[] evenOdd(int[] nums) {
        int[] res = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                res[j] = nums[i];
                j++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                res[j] = nums[i];
                j++;
            }
        }
        return res;
    }
}
