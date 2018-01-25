package codingbat.Logic1.caughtSpeeding;

public class Solution {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        int bonus = isBirthday ? 5 : 0;
        if (speed > 80 + bonus)
            return 2;
        if (speed > 60 + bonus && speed <= 80 + bonus)
            return 1;
        return 0;
    }
}
