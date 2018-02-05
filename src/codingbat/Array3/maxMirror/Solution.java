package codingbat.Array3.maxMirror;

public class Solution {
    public int maxMirror(int[] nums) {
        int largestSize = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            int p1 = i;
            int p2 = nums.length-1;
            boolean b = true;
            while (p1 < nums.length && p2 >= 0) {
                if (b) {
                    if (nums[p1] != nums[p2]) p2--;
                    else {
                        b = false;
                        temp = 1;
                        p1++;
                        p2--;
                    }
                } else {
                    if (nums[p1] == nums[p2]) {
                        temp++;
                        p1++;
                        p2--;
                    } else {
                        if (temp > largestSize) largestSize = temp;
                        p1 = i;
                        b = true;
                    }
                }
                if (temp > largestSize) largestSize = temp;
            }
        }
        return largestSize;
    }
}
