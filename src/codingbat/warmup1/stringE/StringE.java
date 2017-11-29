package codingbat.warmup1.stringE;

public class StringE {
    public static boolean stringE(String str) {
        char[] s = str.toCharArray();
        int count = 0;
        for(int i=0; i<str.length();i++){
            if(s[i]=='e')
                count++;
        }
        return count>=1 && count <=3;

    }

    public static void main(String[] args) {
        System.out.println(stringE("Hello"));
        System.out.println(stringE("Heelle"));
        System.out.println(stringE("Heelele"));
    }
}
