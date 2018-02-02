package codingbat.Array1.biggerTwo;

public class Solution {
    public int[] biggerTwo(int[] a, int[] b) {
        if(a[0]+a[1]>=b[0]+b[1]) return a;
        else return b;
    }
}
