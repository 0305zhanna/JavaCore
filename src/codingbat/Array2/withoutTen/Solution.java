package codingbat.Array2.withoutTen;

public class Solution {
    public int[] withoutTen(int[] nums) {
        int[] res = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                res[j] = nums[i];
                j++;
            }
        }
        return res;
    }
}
