package codingbat.warmup1.max1020;

public class Max1020 {
    public static int max1020(int a, int b){
        int max = 0;
        if(a>=10 &&  a<=20)
            max = a;
        if(b>=10 && b<=20){
            if(b>max)
                max = b;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(max1020(11, 19));
        System.out.println(max1020(19, 11));
        System.out.println(max1020(11, 9));
    }
}
