package codingbat.Logic1.sumLimit;

public class Solution {
    public int sumLimit(int a, int b) {
        String sum = String.valueOf(a + b);
        String stringA = String.valueOf(a);
        return sum.length() == stringA.length() ? a + b : a;
    }
}
