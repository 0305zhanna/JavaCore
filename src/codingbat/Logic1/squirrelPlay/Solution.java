package codingbat.Logic1.squirrelPlay;

public class Solution {
    public boolean squirrelPlay(int temp, boolean isSummer) {
        int high = isSummer ? 100 : 90;

        if (temp >= 60 && temp <= high) {
            return true;
        }
        return false;
    }
}
