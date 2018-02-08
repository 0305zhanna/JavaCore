package codingbat.Functional1.doubling;

import java.util.List;

public class Solution {
    public List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }
}
