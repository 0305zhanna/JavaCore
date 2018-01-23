package hackerrank.Java.DataStructures.JavaStack;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            List<Character> stack = new Stack();
            for (int i = 0; i < input.length(); i++) {
                switch (input.charAt(i)){
                    case '(':
                        stack.add('(');
                        break;
                    case '{':
                        stack.add('{');
                        break;
                    case '[':
                        stack.add('[');
                        break;
                    case ')':
                        if(stack.size()>0){
                            if(stack.get(stack.size()-1) == '(')
                                stack.remove(stack.size()-1);
                        }
                        break;
                    case '}':
                        if(stack.size()>0) {
                            if (stack.get(stack.size()-1) == '{')
                                stack.remove(stack.size()-1);
                        }
                        break;
                    case ']':
                        if(stack.size()>0) {
                            if (stack.get(stack.size()-1) == '[')
                                stack.remove(stack.size()-1);
                        }
                        break;
                }
            }
            System.out.println(stack.isEmpty());
        }
    }
}
