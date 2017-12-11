package hackerrank.Java.String.SyntaxChecker;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            Pattern p = Pattern.compile("\\d");
            Matcher m = p.matcher(pattern);
            System.out.println(m.matches());
            testCases--;
        }
    }
}
