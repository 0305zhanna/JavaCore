package codingbat.Array1.reverse3;

public class Solution {
    public int[] reverse3(int[] nums) {
        int[] n = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            n[i] = nums[nums.length-i-1];
        }
        return n;
    }
}
