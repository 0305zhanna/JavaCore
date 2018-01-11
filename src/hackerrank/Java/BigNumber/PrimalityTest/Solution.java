package hackerrank.Java.BigNumber.PrimalityTest;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();

        if(n.isProbablePrime(1000))
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
}
