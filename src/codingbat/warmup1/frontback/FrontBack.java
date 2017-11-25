package codingbat.warmup1.frontback;

public class FrontBack {
    public static String frontBack(String str) {
        if(str.length() <= 1){
            return str;
        }
        return str.charAt(str.length()-1) + str.substring(1,str.length()-1)+str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
    }
}
