package codingbat.string1.deFront;

public class Solution {
    public String deFront(String str) {
        if (str.length() < 1)
            return str;

        if (str.charAt(0) != 'a') {
            str = str.substring(1, str.length());
            if (str.length() < 1)
                return str;

            if (str.charAt(0) != 'b') {
                str = str.substring(1, str.length());
            }
        } else {
            if (str.length() < 2)
                return str;
            if (str.charAt(1) != 'b') {
                str = str.charAt(0) + str.substring(2, str.length());
            }
        }

        return str;
    }
}
