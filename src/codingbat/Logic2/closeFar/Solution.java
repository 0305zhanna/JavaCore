package codingbat.Logic2.closeFar;

public class Solution {
    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(b - c) < 2) return false;
        return Math.abs(a - b) < 2 && Math.abs(a - c) > 1 || Math.abs(a - c) < 2 && Math.abs(a - b) > 1;
    }
}
