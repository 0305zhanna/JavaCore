package hackerrank.Java.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandling {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);

            int x = in.nextInt();
            int y = in.nextInt();


            System.out.println(x / y);

        }catch(InputMismatchException e)
            {
                System.out.print(e.getClass().getName());
            }
        catch(Exception e)
            {
                System.out.print(e);
            }

    }
}
