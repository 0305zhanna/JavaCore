package codingbat.warmup1.mixstart;

public class MixStart {
    public static boolean mixStart(String str) {
        return str.startsWith("ix",1);
    }

    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("pix snacks"));
        System.out.println(mixStart("piz snacks"));
    }
}
