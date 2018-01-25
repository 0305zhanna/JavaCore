package codingbat.Logic1.answerCell;

public class Solution {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep)
            return false;
        else if (isMorning)
            return isMom ? true : false;
        return true;
    }
}
