package codingbat.String2.getSandwich;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public String getSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");
        if (first == last) return "";
        return str.substring(first+5, last);
    }

    public String getSandwich2(String str) {
        if (str.length() < 10) return "";
        String s = "";
        Pattern p = Pattern.compile("(bread)(\\w*)(bread)");
        Matcher m = p.matcher(str);
        if (m.find())
            s = m.group(2);
        return s;
    }
}
