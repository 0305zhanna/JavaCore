package codingbat.Logic2.noTeenSum;

public class Solution {
    public int fixTeen(int n) {
        return (n > 12 && n < 20 && n != 15 && n != 16) ? 0 : n;
    }

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }
}
