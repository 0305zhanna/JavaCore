package codingbat.warmup1.missingchar;

public class MissingChar {
    public static String missingChar(String str, int n) {
        if(n == 0){
            return str.substring(1);
        }
        if(n==str.length()){
            return str.substring(0,str.length()-1);
        }
        return str.substring(0, n)+str.substring(n+1, str.length());
    }

    public static void main(String[] args) {
        System.out.println(missingChar("kitten", 1));
        System.out.println(missingChar("kitten", 0));
        System.out.println(missingChar("kitten", 4));
    }
}
