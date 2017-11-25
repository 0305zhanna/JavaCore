package codingbat.warmup1.diff21;

public class Diff21 {
    public static int diff21(int n) {
        if(n > 21){
            return 2 * Math.abs(21 - n);
        }else{
            return Math.abs(21 - n);
        }
    }

    public static void main(String[] args) {
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
    }
}
