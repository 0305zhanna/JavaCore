package codingbat.String3.countYZ;

public class Solution {
    public int countYZ(String str) {
        int count = 0;
        for (int i = 1; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                if (str.charAt(i - 1) == 'y' || str.charAt(i - 1) == 'Y' || str.charAt(i - 1) == 'z' || str.charAt(i - 1) == 'Z')
                    count++;
            }
        }
        if (str.charAt(str.length() - 1) == 'y' || str.charAt(str.length() - 1) == 'Y' || str.charAt(str.length() - 1) == 'z' || str.charAt(str.length() - 1) == 'Z')
            count++;
        return count;
    }
}
