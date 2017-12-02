package codingbat.warmup1.everynth;

public class EveryNth {
    public static String everyNth(String str, int n) {
        String res = "";
        for (int i=0; i<str.length(); i = i + n) {
            res += str.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(everyNth("Miracle", 2));
        System.out.println(everyNth("abcdefg", 2));
        System.out.println(everyNth("abcdefg", 3));
        System.out.println(everyNth("Chocolates", 3));
    }
}
