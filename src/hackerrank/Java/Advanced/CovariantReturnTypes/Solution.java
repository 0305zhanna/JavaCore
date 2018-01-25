package hackerrank.Java.Advanced.CovariantReturnTypes;

import java.lang.reflect.Method;
import java.util.Scanner;

class Flower{
    String whatsYourName(){
        return "I have many names and types";
    }
}
class Jasmine extends Flower{
    @Override
    String whatsYourName() {
        return "Jasmine";
    }
}
class Lily extends Flower{
    @Override
    String whatsYourName() {
        return "Lily";
    }
}
class Lotus extends Flower{
    @Override
    String whatsYourName() {
        return "Lotus";
    }
}
class State{
    Flower yourNationalFlower(){
        return new Flower();
    }
}
class WestBengal extends State{
    @Override
    Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}
class Karnataka extends State{
    @Override
    Lotus yourNationalFlower() {
        return new Lotus();
    }
}
class AndhraPradesh extends State{
    @Override
    Lily yourNationalFlower() {
        return new Lily();
    }
}

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println(AndhraPradesh.class.getName());
        System.out.println(Karnataka.class.getName());
        System.out.println(WestBengal.class.getName());

        String state = in.nextLine();

        Method method = Class.forName(state).getDeclaredMethod("yourNationalFlower");

        Flower f = (Flower) method.invoke(Class.forName(state).newInstance());

        System.out.println(f.whatsYourName());
    }
}
