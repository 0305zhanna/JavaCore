package codingbat.warmup1.loneTeen;

public class LoneTeen {
    public static boolean loneTeen(int a, int b) {
        return (13<=a && a<= 19) ^ (13<=b && b<= 19);
    }

    public static void main(String[] args) {
        System.out.println(loneTeen(13, 99));
        System.out.println(loneTeen(21, 19));
        System.out.println(loneTeen(13, 13));
    }
}
