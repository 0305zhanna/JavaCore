package hackerrank.Java.String.JavaAnagrams;

import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length())
            return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        boolean anagrams = true;
        for(int i = 'a';i<'z';i++){
            int k1 = 0;
            int k2 = 0;
            for (int j = 0; j<a.length();j++){
                if (a.charAt(j) == i) k1++;
                if (b.charAt(j) == i) k2++;
            }
            if(k1 != k2) {
                anagrams = false;
                break;
            }
        }
        return anagrams;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();
        boolean ret = isAnagram(a,b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
