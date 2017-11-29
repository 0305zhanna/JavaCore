package codingbat.warmup1.delDel;

public class DelDel {
    public static String delDel(String str) {
        if(str.startsWith("del",1)){
            return str.replaceAll("del","");
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(delDel("adelbc"));
        System.out.println(delDel("adelHello"));
        System.out.println(delDel("adedbc"));
    }
}
