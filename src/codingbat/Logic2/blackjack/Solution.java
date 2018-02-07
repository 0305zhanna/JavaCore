package codingbat.Logic2.blackjack;

public class Solution {
    public int blackjack(int a, int b) {
        if (21 - a < 0 && 21 - b < 0)
            return 0;
        if (21 - a < 0)
            return b;
        if (21 - b < 0)
            return a;
        return (21 - b > 21 - a) ? a : b;

    }
}
