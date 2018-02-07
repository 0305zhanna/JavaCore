package codingbat.Logic2.loneSum;

public class Solution {
    public int loneSum(int a, int b, int c) {
        return (a == b && b == c) ? 0 : (a == b) ? c : (b == c) ? a : (a == c) ? b : a + b + c;
    }
}
