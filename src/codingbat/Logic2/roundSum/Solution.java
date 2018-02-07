package codingbat.Logic2.roundSum;

public class Solution {
    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num) {
        if (num % 10 >= 5) {
            return (num / 10) * 10 + 10;
        } else if (num % 10 == 0) {
            return num;
        } else {
            return (num / 10) * 10;
        }
    }
}
