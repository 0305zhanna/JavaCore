package hackerrank.Java.Advanced.SHA256;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(s.getBytes("UTF-8"));
        String hashtext = new BigInteger(1, hash).toString(16);
        while (hashtext.length()<64){
            hashtext ="0"+hashtext;
        }
        System.out.println(hashtext);

    }
}
