package codingbat.Array2.matchUp;

public class Solution {
    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        int min = Math.min(nums1.length, nums2.length);
        for (int i = 0; i < min; i++)
            if (Math.abs(nums1[i] - nums2[i]) != 0 && Math.abs(nums1[i] - nums2[i]) <= 2)
                count++;
        return count;
    }
}
