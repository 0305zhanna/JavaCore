package codingbat.Array2.post4;

public class Solution {
    public int[] post4(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==4) index = i+1;
        }
        int[] res = new int[nums.length-index];
        for (int i = 0; i < res.length; i++) {
            res[i] = nums[index+i];
        }
        return res;
    }
}
