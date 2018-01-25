package hackerrank.Java.Advanced.JavaMD5;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        MessageDigest md = MessageDigest.getInstance("MD5");
        System.out.println(new BigInteger(1,md.digest(str.getBytes("UTF-8"))).toString(16));
        in.close();
    }
}
