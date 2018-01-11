package hackerrank.Java.BigNumber.BigDecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        String s[] = new String[testCases+2];
        for(int i = 0; i<testCases;i++){
            s[i] = in.next();
        }
        in.close();
        String arr[] = new String[testCases];
        System.arraycopy(s,0,arr,0,testCases);
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal d1 = new BigDecimal(o1);
                BigDecimal d2 = new BigDecimal(o2);
                return d2.compareTo(d1);
            }
        });
        for (String i:arr){
            System.out.println(i);
        }
    }
}
