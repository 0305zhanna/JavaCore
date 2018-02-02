package codingbat.Array2.has12;

public class Solution {
    public boolean has12(int[] nums) {
        boolean b = true;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                count++;
                b = false;
                for (int j = i; j < nums.length; j++) {
                    if(nums[j] == 2){
                        b = true;
                        break;
                    }
                }
            }
        }
        return b && count!=0;
    }
}
