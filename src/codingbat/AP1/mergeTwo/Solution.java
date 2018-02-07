package codingbat.AP1.mergeTwo;

public class Solution {
    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] res = new String[n];
        int indA = 0;
        int indB = 0;
        for (int i = 0; i < n; i++) {
            if (a[indA].compareTo(b[indB]) < 0){
                res[i] = a[indA++];
            } else if(a[indA].compareTo(b[indB]) > 0){
                res[i] = b[indB++];
            }else {
                res[i] = b[indB++];
                indA++;
            }
        }
        return res;
    }
}
