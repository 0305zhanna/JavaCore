package codingbat.string1.makeAbba;

public class Solution {
    public static String makeAbba(String a, String b) {
        return a+b+b+a;
    }

    public static void main(String[] args) {
        System.out.println(makeAbba("Hi", "Bye"));
    }
}
