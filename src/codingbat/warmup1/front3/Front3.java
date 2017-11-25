package codingbat.warmup1.front3;

public class Front3 {
    public static String front3(String str) {
        if(str.length() < 3) return str+str+str;
        String front = str.substring(0,3);
        return front+front+front;
    }

    public static void main(String[] args) {
        System.out.println(front3("Java"));
        System.out.println(front3("Chocolate"));
        System.out.println(front3("abc"));
        System.out.println(front3("ab"));
        System.out.println("");
    }
}
