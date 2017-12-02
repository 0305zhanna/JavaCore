package codingbat.warmup1.endup;

public class EndUp {
    public static String endUp(String str) {
        if(str.length() < 3){
            return str.toUpperCase();
        }
        return str.substring(0,str.length()-3) + str.substring(str.length()-3).toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(endUp("Hello"));
        System.out.println(endUp("hi there"));
        System.out.println(endUp("hi"));
    }
}
