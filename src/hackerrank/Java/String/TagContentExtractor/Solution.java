package hackerrank.Java.String.TagContentExtractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        Pattern p = Pattern.compile("<([\\p{Print}]+)>([^<>]+)<\\/\\1>");
        while(testCases>0){
            String line = in.nextLine();
            Matcher m = p.matcher(line);
            int c = 0;
            while (m.find()) {
                System.out.println(m.group(2));
                c++;
            }
            if(c==0)
                System.out.println("None");
            testCases--;
        }
    }
}
