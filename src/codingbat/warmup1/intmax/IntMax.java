package codingbat.warmup1.intmax;

public class IntMax {
    public static int intMax(int a, int b, int c) {
        int res = a;
        if(b>res) res = b;
        if(c>res) res = c;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(intMax(1, 2, 3));
        System.out.println(intMax(1, 3, 2));
        System.out.println(intMax(3, 2, 1));
    }
}
