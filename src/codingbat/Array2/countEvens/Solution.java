package codingbat.Array2.countEvens;

public class Solution {
    public int countEvens(int[] nums) {
        if (nums.length < 1) return 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0)
                count++;
        }
        return count;
    }
}
