package codingbat.Array2.centeredAverage;

public class Solution {
    public int centeredAverage(int[] nums) {
        if (nums.length < 2) return 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        int sum = 0;
        int count = 0;
        boolean maxed = true;
        boolean mined = true;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==max && maxed){
                maxed = false;
                continue;
            }
            if(nums[i]==min && mined){
                mined = false;
                continue;
            }
            sum+=nums[i];
            count++;
        }
        return sum/count;
    }
}
