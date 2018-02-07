package codingbat.String3.notReplace;

public class Solution {
    public String notReplace(String str) {
        String res = "";
        str = " " + str + "  ";
        int index = str.indexOf("is");
        for (int i = 1; i < str.length()-2; i++) {
            if(str.charAt(i) == 'i' && str.charAt(i+1)=='s'){
                if(!(Character.isLetter(str.charAt(i-1)) || Character.isLetter(str.charAt(i+2)))){
                    res+="is not";
                    i++;
                    continue;
                }
            }
            res+=str.charAt(i);
        }
        return res;
    }
}
