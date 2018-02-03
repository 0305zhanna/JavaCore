package codingbat.Array2.pre4;

public class Solution {
    public int[] pre4(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==4)
                break;
            count++;
        }
        int[] res = new int[count];
        for (int i = 0; i < count; i++) {
            res[i] = nums[i];
        }
        return res;
    }
}
