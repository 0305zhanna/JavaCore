package codingbat.String3.sumNumbers;

public class Solution {
    public int sumNumbers(String str) {
        if (str.length() < 1) return 0;
        String s = "";
        int sum = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (Character.isDigit(str.charAt(i))) {
                s += str.charAt(i);
            }
            if (!Character.isDigit(str.charAt(i + 1))) {
                if (s.length() != 0)
                    sum += Integer.parseInt(s);
                s = "";
            }
        }
        if (Character.isDigit(str.charAt(str.length()-1)))
            s += str.charAt(str.length()-1);
        if (s.length() != 0)
            sum += Integer.parseInt(s);
        return sum;
    }
}
