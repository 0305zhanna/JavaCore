package codingbat.string1.seeColor;

public class Solution {
    public String seeColor(String str) {
        String[] colors = new String[]{"red", "blue"};
        if (str.equals("red") || str.equals("blue"))
            return str;
        else {
            for (int i = 0; i < colors.length; i++) {
                if(str.length() < colors[i].length())
                    break;
                if (str.substring(0, colors[i].length()).equals(colors[i]))
                    return colors[i];
                }
        }
        return "";
    }
}
