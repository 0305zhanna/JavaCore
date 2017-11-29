package codingbat.warmup1.front22;

public class Front22 {
    public static String front22(String str) {
        if (str.length()<2){
            return str+str+str;
        }else{
            String s = str.substring(0,2);
            return s+str+s;
        }
    }

    public static void main(String[] args) {
        System.out.println(front22("kitten"));
        System.out.println(front22("Ha"));
        System.out.println(front22("abc"));
        System.out.println(front22("b"));
    }
}
