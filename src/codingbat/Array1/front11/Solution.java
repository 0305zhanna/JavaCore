package codingbat.Array1.front11;

public class Solution {
    public int[] front11(int[] a, int[] b) {
        if (a.length == 0 && b.length != 0) return new int[]{b[0]};
        if (b.length == 0 && a.length != 0) return new int[]{a[0]};
        if (b.length == 0 && a.length == 0) return a;
        return new int[]{a[0], b[0]};
    }
}
