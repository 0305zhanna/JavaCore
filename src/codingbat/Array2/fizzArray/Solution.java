package codingbat.Array2.fizzArray;

public class Solution {
    public int[] fizzArray(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = i;
        }
        return res;
    }
}
