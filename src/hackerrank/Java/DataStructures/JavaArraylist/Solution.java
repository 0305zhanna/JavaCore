package hackerrank.Java.DataStructures.JavaArraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i<n;i++){
            int d = in.nextInt();
            list.add(new int[d]);
            for (int j = 0; j < d;j++){
                list.get(i)[j] = in.nextInt();
            }
            for (int u:list.get(i)) {
                System.out.print(u+" ");
            }

        }
        int q = in.nextInt();
        for (int i = 0; i<q;i++){
            int x = in.nextInt();
            int y = in.nextInt();
            if(x>list.size()) {
                System.out.println(list.size());
                System.out.println("ERROR!");
                continue;
            }
            if(y>list.get(x-1).length) {
                System.out.println(list.get(x-1).length);
                System.out.println("ERROR!");
                continue;
            }
            System.out.println(list.get(x-1)[y-1]);
        }
    }
}
