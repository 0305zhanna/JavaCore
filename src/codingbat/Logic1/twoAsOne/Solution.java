package codingbat.Logic1.twoAsOne;

public class Solution {
    public boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }
}
