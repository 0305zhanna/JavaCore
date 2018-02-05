package codingbat.Array3.squareUp;

public class Solution {
    public int[] squareUp(int n) {
        int[] res = new int[n*n];
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >= n-1-i; j--) {
                res[i*n+j] = n-j;
            }
        }
        return res;
    }
}
