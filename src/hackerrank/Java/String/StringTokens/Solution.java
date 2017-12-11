package hackerrank.Java.String.StringTokens;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        String[] tokens = s.split("[,!?._'@\\s\\t]+");
        if(tokens.length == 1 && tokens[0].equals("")){
            System.out.println(0);
            return;
        }
        System.out.println(tokens.length);
        for(int i = 0; i<tokens.length;i++){
            System.out.println(tokens[i].equals(""));
            System.out.println("\""+tokens[i]+"\"");
        }
        scan.close();
    }
}
