package codingbat.Array1.make2;

public class Solution {
    public int[] make2(int[] a, int[] b) {
        int[] res = new int[2];
        if(a.length==0){
            res[0] = b[0];
            res[1] = b[1];
        }else if(a.length==1){
            res[0] = a[0];
            res[1] = b[0];
        }else {
            res[0] = a[0];
            res[1] = a[1];
        }
        return res;
    }
}
