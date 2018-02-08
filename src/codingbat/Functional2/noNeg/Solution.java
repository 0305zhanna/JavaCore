package codingbat.Functional2.noNeg;

import java.util.List;

public class Solution {
    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }
}
