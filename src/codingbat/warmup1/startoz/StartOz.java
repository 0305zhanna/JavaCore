package codingbat.warmup1.startoz;

public class StartOz {
    public static String startOz(String str) {
        String res = "";
        if(str.length()>1) {
            if (str.charAt(0) == 'o'){
                res += 'o';
            }
            if(str.charAt(1) == 'z'){
                res += 'z';
            }
        }else if(str.length() == 1){
            if(str.charAt(0)=='o')
                res+='o';
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(startOz("ozymandias"));
        System.out.println(startOz("bzoo"));
        System.out.println(startOz("oxx"));
        System.out.println(startOz(""));
        System.out.println(startOz("z"));
    }
}
