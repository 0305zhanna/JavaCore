package codingbat.Recursion1.count8;

public class Solution {
    public int count8(int n) {
        if(n==0) return 0;
        if(n%100 == 88) return 2+count8(n/10);
        return (n % 10 == 8) ? 1+count8(n/10) : count8(n/10);
    }
}
