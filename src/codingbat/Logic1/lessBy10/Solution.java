package codingbat.Logic1.lessBy10;

public class Solution {
    public boolean lessBy10(int a, int b, int c) {
        return Math.abs(a - b) > 9 || Math.abs(b - c) > 9 || Math.abs(a - c) > 9;
    }
}
