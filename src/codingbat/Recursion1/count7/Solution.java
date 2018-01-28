package codingbat.Recursion1.count7;

public class Solution {
    public int count7(int n) {
        if(n<10)
            return (n == 7) ? 1:0;
        return (n % 10 == 7) ? 1+count7(n/10) : count7(n/10);
    }
}
