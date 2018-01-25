package codingbat.Logic1.nearTen;

public class Solution {
    public boolean nearTen(int num) {
        return num % 10 < 3 || num % 10 > 7;
    }
}
