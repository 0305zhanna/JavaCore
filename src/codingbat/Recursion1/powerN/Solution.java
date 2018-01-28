package codingbat.Recursion1.powerN;

public class Solution {
    public int powerN(int base, int n) {
        if(base == 1) return 1;
        if(n == 0) return 1;
        return base*powerN(base,n-1);
    }
}
