package codingbat.Logic1.withoutDoubles;

public class Solution {
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles) {
            if (die1 == die2)
                return die1 == 6 ? 7 : die1 + die2 + 1;
        }
        return die1 + die2;
    }
}
