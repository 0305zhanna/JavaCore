package codingbat.Recursion1.triangle;

public class Solution {
    public int triangle(int rows) {
        if(rows == 0) return 0;
        return rows+triangle(rows-1);
    }
}
