package codingbat.Array2.fizzBuzz;

public class Solution {
    public String[] fizzBuzz(int start, int end) {
        String[] res = new String[end-start];
        for (int i = 0; i < res.length; i++) {
            if((start+i)%3==0 && (start+i)%5==0){
                res[i] = "FizzBuzz";
                continue;
            }
            if((start+i)%3==0){
                res[i] = "Fizz";
                continue;
            }
            if((start+i)%5==0){
                res[i] = "Buzz";
                continue;
            }
            res[i] = String.valueOf(start+i);
        }
        return res;
    }
}
