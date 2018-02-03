package codingbat.Array2.zeroFront;

import java.util.Arrays;

public class Solution {
    public int[] zeroFront(int[] nums) {
        if(nums.length<2) return nums;
        int[] res = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                res[j] = nums[i];
                j++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                res[j] = nums[i];
                j++;
            }
        }
        return res;
    }
}
