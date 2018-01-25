package codingbat.Logic1.sortaSum;

public class Solution {
    public int sortaSum(int a, int b) {
        a += b;
        if(a>=10 && a<20)
            return 20;
        return a;
    }
}
