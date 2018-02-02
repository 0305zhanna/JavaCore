package codingbat.Array2.twoTwo;

public class Solution {
    public boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 2) {
                int count = 0;
                for (int j = i; j < nums.length; j++)
                    if (nums[j] == 2) count++;
                    else break;
                i += count;
                if (count < 2) return false;
            }
        return true;
    }
}
