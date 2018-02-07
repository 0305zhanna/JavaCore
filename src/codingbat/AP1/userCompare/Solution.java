package codingbat.AP1.userCompare;

public class Solution {
    public int userCompare(String aName, int aId, String bName, int bId) {
        if (aName.equals(bName)) {
            if (aId == bId) {
                return 0;
            } else {
                return (aId > bId) ? 1 : -1;
            }
        } else {
            return (aName.compareTo(bName)>0) ? 1:-1;
        }
    }
}
