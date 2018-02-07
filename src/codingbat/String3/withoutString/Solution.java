package codingbat.String3.withoutString;

public class Solution {
    public String withoutString(String base, String remove) {
        String res  = "";
        int index = base.toLowerCase().indexOf(remove.toLowerCase());
        while (index != -1){
            res += base.substring(0,index);
            base = base.substring(index+remove.length());
            index = base.toLowerCase().indexOf(remove.toLowerCase());
        }
        res += base;
        return res;
    }
}
