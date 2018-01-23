package hackerrank.Java.DataStructures.JavaList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> l = new ArrayList();
        for (int i = 0; i < n; i++) {
            int value = in.nextInt();
            l.add(value);
        }
        int q = in.nextInt();

        for (int i = 0; i < q; i++) {
            String query = in.next();
            if (query.equals("Insert")) {
                int x = in.nextInt();
                int y = in.nextInt();
                l.add(x, y);

            } else if (query.equals("Delete")) {
                int x = in.nextInt();
                l.remove(x);
            }
        }
        for (Integer i : l) {
            System.out.print(i + " ");
        }
    }
}
