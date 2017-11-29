package codingbat.warmup1.in1020;

public class In1020 {
    public static boolean in1020(int a, int b) {
        return (10 <= a && a <= 20) || (10 <= b && b <= 20);
    }

    public static void main(String[] args) {
        System.out.println(in1020(12, 99));
        System.out.println(in1020(21, 12));
        System.out.println(in1020(8, 99));
    }
}
