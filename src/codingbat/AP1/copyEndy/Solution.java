package codingbat.AP1.copyEndy;

public class Solution {
    public int[] copyEndy(int[] nums, int count) {
        int[] res = new int[count];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(isEndy(nums[i])){
                res[j] = nums[i];
                j++;
            }
            if(j == count)
                break;
        }
        return res;
    }
    boolean isEndy(int n){
        return n>=0 && n<=10 ||n>=90 && n<=100 ;
    }
}
