package codingbat.Array1.makeLast;

public class Solution {
    public int[] makeLast(int[] nums) {
        int[] n = new int[nums.length*2];
        n[n.length-1] = nums[nums.length-1];
        return n;
    }
}
