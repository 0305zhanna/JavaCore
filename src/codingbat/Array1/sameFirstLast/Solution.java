package codingbat.Array1.sameFirstLast;

public class Solution {
    public boolean sameFirstLast(int[] nums) {
        return (nums.length>=1 && nums[0] == nums[nums.length-1]);
    }
}
