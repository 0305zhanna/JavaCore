package codingbat.Logic1.shareDigit;

public class Solution {
    public boolean shareDigit(int a, int b) {
        return (a % 10 == b % 10 || a % 10 == b / 10 || a / 10 == b % 10 || a / 10 == b / 10);
    }
}
