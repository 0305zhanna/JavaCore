package codingbat.Logic1.specialEleven;

public class Solution {
    public boolean specialEleven(int n) {
        return (n % 11 == 0 || n % 11 == 1) ? true : false;
    }
}
