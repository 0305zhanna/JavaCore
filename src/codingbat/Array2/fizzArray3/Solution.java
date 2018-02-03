package codingbat.Array2.fizzArray3;

public class Solution {
    public int[] fizzArray3(int start, int end) {
        int[] res = new int[end-start];
        for (int i = 0; i < end-start; i++) {
            res[i] = start+i;
        }
        return res;
    }
}
