package codingbat.Logic1.cigarParty;

public class Solution {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if(isWeekend){
            if(cigars>=40)
                return true;
        }else {
            if(cigars>=40 && cigars<=60)
                return true;
        }
        return false;
    }
}
