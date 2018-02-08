package codingbat.Functional1.rightDigit;

import java.util.List;

public class Solution {
    public List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n -> n % 10);
        return nums;
    }
}
