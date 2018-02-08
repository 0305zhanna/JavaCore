package codingbat.Functional2.noTeen;

import java.util.List;

public class Solution {
    public List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n -> n > 12 && n < 20);
        return nums;
    }
}
