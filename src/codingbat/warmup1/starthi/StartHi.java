package codingbat.warmup1.starthi;

public class StartHi {
    public static boolean startHi(String str) {
        return str.startsWith("hi");
    }

    public static void main(String[] args) {
        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));
    }
}
