package codingbat.Functional1.math1;

import java.util.List;

public class Solution {
    public List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n -> (n + 1) * 10);
        return nums;
    }
}
