package codingbat.String2.xyBalance;

public class Solution {
    public boolean xyBalance(String str) {
        if(str.endsWith("y")) return true;
        boolean balanced = true;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='x') balanced = false;
            if(str.charAt(i)=='y') balanced=true;
        }
        return balanced;
    }
}
