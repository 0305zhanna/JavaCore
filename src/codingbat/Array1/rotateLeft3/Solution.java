package codingbat.Array1.rotateLeft3;

public class Solution {
    public int[] rotateLeft3(int[] nums) {
        int[] n = new int[3];
        n[0] = nums[1];
        n[1] = nums[2];
        n[2] = nums[0];
        return n;
    }
}
