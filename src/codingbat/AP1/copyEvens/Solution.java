package codingbat.AP1.copyEvens;

public class Solution {
    public int[] copyEvens(int[] nums, int count) {
        int[] res = new int[count];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
                res[j] = nums[i];
                j++;
            }
            if(j == count)
                break;
        }
        return res;
    }
}
