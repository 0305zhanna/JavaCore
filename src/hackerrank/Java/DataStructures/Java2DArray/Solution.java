package hackerrank.Java.DataStructures.Java2DArray;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int sums = -2147483648;
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                int sum = 0;
                sum += arr[i][j]+arr[i][j+1]+arr[i][j+2];
                sum += arr[i+1][j+1];
                sum += arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(sums<sum)
                    sums = sum;
            }
        }

        System.out.println(sums);

    }
}
