package codingbat.String2.catDog;

public class Solution {
    public boolean catDog(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.substring(i).startsWith("cat")) count++;
            if(str.substring(i).startsWith("dog")) count--;
        }
        return count==0;
    }
}
