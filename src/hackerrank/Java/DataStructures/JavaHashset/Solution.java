package hackerrank.Java.DataStructures.JavaHashset;

import java.util.*;

public class Solution {
    public static void main() {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> map = new HashSet<>();
        for (int i = 0; i < t; i++) {
            map.add(pair_left[i] +", "+ pair_right[i]);
            System.out.println(map.size());
        }

    }

}