package codingbat.Functional2.no9;

import java.util.List;

public class Solution {
    public List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n -> n % 10 == 9);
        return nums;
    }
}
