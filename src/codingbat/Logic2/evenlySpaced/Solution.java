package codingbat.Logic2.evenlySpaced;

public class Solution {
    public boolean evenlySpaced(int a, int b, int c) {
        int min = Math.min(Math.min(a, b), c);
        int mid = Math.max(Math.min(a, b), c);
        int mid2 = Math.min(Math.max(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        return Math.abs(mid - min) == Math.abs(mid - max)
                || Math.abs(mid2 - min) == Math.abs(mid2 - max);
    }
}
