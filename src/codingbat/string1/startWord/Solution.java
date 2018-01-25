package codingbat.string1.startWord;

public class Solution {
    public String startWord(String str, String word) {
        if(str.length()<1)
            return str;
        if(str.startsWith(word))
            return word;
        if(str.substring(1, str.length()).startsWith(word))
            return str.substring(0,1);
        if(str.substring(1,str.length()).startsWith(word.substring(1,word.length())))
            return str.charAt(0)+word.substring(1,word.length());
        return "";
    }
}
