package codingbat.Logic1.maxMod5;

public class Solution {
    public int maxMod5(int a, int b) {
        if (a == b)
            return 0;
        else {
            if (a % 5 == b % 5) {
                return a < b ? a : b;
            }
            return a > b ? a : b;
        }
    }
}
