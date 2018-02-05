package codingbat.Array3.linearIn;

public class Solution {
    public boolean linearIn(int[] outer, int[] inner) {
        int j = 0;
        for (int i = 0; i < outer.length; i++) {
            if(j == inner.length) break;
            if(outer[i] == inner[j]){
                j++;
            }
        }
        return j == inner.length;
    }
}
