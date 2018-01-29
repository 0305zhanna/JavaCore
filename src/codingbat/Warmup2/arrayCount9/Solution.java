package codingbat.Warmup2.arrayCount9;

public class Solution {
    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int n : nums) {
            count = (n == 9) ? count+1:count;
        }
        return count;
    }
}
