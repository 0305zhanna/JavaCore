package codingbat.Array1.frontPiece;

public class Solution {
    public int[] frontPiece(int[] nums) {
        if(nums.length<2) return nums;
        return new int[]{nums[0],nums[1]};
    }
}
