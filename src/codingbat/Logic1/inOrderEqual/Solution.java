package codingbat.Logic1.inOrderEqual;

public class Solution {
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return equalOk ? a <= b && b <= c : a < b && b < c;
    }
}
