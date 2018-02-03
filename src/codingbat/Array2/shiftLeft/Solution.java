package codingbat.Array2.shiftLeft;

public class Solution {
    public int[] shiftLeft(int[] nums) {
        if(nums.length<1) return nums;
        int[] res = new int[nums.length];
        res[res.length-1] = nums[0];
        for (int i = 0; i < res.length - 1; i++) {
            res[i] = nums[i+1];
        }
        return res;
    }
}
