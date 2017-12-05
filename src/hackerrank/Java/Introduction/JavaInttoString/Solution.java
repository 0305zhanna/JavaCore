package hackerrank.Java.Introduction.JavaInttoString;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        if(n == Integer.parseInt(s)){
            System.out.println("Ok");
        }else {
            System.out.println("Wrong");
        }
    }
}
