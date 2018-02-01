package codingbat.String2.endOther;

public class Solution {
    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        return b.endsWith(a)||a.endsWith(b);
    }
}
