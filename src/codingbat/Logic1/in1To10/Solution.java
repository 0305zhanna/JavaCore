package codingbat.Logic1.in1To10;

public class Solution {
    public boolean in1To10(int n, boolean outsideMode) {
        if (!outsideMode) {
            return (n >= 1 && n <= 10) ? true : false;
        } else {
            return (n <= 1 || n >= 10) ? true : false;
        }
    }
}
