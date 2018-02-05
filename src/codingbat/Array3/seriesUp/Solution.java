package codingbat.Array3.seriesUp;

public class Solution {
    public int[] seriesUp(int n) {
        int[] res = new int[n*(n+1)/2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                res[index] = j+1;
                index++;
            }
        }
        return res;
    }
}
