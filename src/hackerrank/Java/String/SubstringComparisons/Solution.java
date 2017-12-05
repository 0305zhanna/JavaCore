package hackerrank.Java.String.SubstringComparisons;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

    private static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        for(int i = 1; i<s.length()-k+1; i++){
            smallest = (smallest.compareTo(s.substring(i,i+k))>0) ? s.substring(i,i+k) : smallest;
            largest = (largest.compareTo(s.substring(i,i+k))<0) ? s.substring(i,i+k) : largest;
         //   System.out.println(s.substring(i,i+k));
        }
        return smallest + "\n" + largest;
    }
}
