package codingbat.Array2.fizzArray2;

public class Solution {
    public String[] fizzArray2(int n) {
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = String.valueOf(i);
        }
        return res;
    }
}
