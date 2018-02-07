package codingbat.String3.equalIsNot;

public class Solution {
    public boolean equalIsNot(String str) {
        String temp = str;
        int count = 0;
        int index = temp.indexOf("is");
        while (index != -1) {
            temp = temp.substring(index+2);
            count++;
            index = temp.indexOf("is");
        }
        temp = str;
        index = temp.indexOf("not");
        while (index != -1) {
            temp = temp.substring(index+3);
            count--;
            index = temp.indexOf("not");

        }
        return count==0;
    }
}
