package hackerrank.Java.String.StringReverse;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        boolean palindrome=true;
        for (int i = 0;i<A.length()/2;i++){
            if(A.charAt(i) != A.charAt(A.length()-i-1) ) palindrome = false;
        }
        System.out.println(palindrome ? "Yes" : "No");
    }
}
