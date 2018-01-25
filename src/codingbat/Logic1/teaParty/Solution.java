package codingbat.Logic1.teaParty;

public class Solution {
    public int teaParty(int tea, int candy) {
        if (tea > 4 && candy > 4) {
            if (tea / candy >= 2 || candy / tea >= 2)
                return 2;
            return 1;
        } else
            return 0;
    }
}
