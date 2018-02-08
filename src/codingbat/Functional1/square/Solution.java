package codingbat.Functional1.square;

import java.util.List;

public class Solution {
    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }
}
