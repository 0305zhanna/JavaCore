package codingbat.Array3.fix45;

public class Solution {
    public int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 4) {
                int temp = nums[i + 1];
                nums[i + 1] = 5;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 5) {
                        if (j > 0) {
                            if (nums[j - 1] != 4) {
                                nums[j] = temp;
                                break;
                            }
                        } else {
                            nums[j] = temp;
                            break;
                        }
                    }
                }
            }
        }
        return nums;
    }
}
