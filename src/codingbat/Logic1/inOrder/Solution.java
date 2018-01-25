package codingbat.Logic1.inOrder;

public class Solution {
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        return bOk ? c > b : b > a && c > b;
    }
}
