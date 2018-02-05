package codingbat.Array3.countClumps;

public class Solution {
    public int countClumps(int[] nums) {
        boolean b = false;
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(b){
                if(nums[i] != nums[i+1])
                    b = false;
            }else {
                if(nums[i] == nums[i+1]){
                    b = true;
                    count++;
                }
            }
        }
        return count;
    }
}
