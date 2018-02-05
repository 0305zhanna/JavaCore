package codingbat.Array3.canBalance;

public class Solution {
    public boolean canBalance(int[] nums) {
        if (nums.length < 2) return false;
        int sum1 = 0;
        int sum2 = 0;
        int it1 = 0;
        int it2 = nums.length;
        while (it1 != it2) {
            if (sum1 >= sum2) {
                it2--;
                sum2 += nums[it2];
            }else{
                sum1 += nums[it1];
                it1++;
            }
        }
        return sum1 == sum2;
    }
}
