package hackerrank.Java.DataStructures.JavaSubarray;

import java.util.Scanner;

public class Solution {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n;i++) {
            arr[i] = in.nextInt();
        }
        int count = 0;
        for(int i = 0; i<n;i++){
            int sum = arr[i];
            if(sum < 0)
                count++;
            for(int j = i+1; j < n; j++){
                sum += arr[j];
                if(sum < 0)
                    count++;
            }
        }
        System.out.println(count);
    }
}
