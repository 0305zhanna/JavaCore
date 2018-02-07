package codingbat.Logic2.makeChocolate;

public class Solution {
    public int makeChocolate(int small, int big, int goal) {
        int bigs = goal/5;
        if(big>=bigs)
            return (goal - 5*bigs <= small) ? goal - 5*bigs : -1;
        return (goal - 5*big <= small) ? goal - 5*big : -1;
    }
}
