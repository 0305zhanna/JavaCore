package codingbat.AP1.commonTwo;

public class Solution {
    public int commonTwo(String[] a, String[] b) {
        int indA = 0;
        int indB = 0;
        int count = 0;
        String last = "";
        while (indA<a.length && indB<b.length){
            if(a[indA].equals(last)){
                indA++;
                continue;
            }
            if(b[indB].equals(last)){
                indB++;
                continue;
            }
            if(a[indA].compareTo(b[indB])<0){
                indA++;
            }else if(a[indA].compareTo(b[indB])>0){
                indB++;
            }else {
                count++;
                last = a[indA];
                indA++;
                indB++;
            }
        }
        return count;
    }
}
