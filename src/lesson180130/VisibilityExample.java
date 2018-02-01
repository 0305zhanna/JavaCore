package lesson180130;

import static lesson180130.ThreadUtils.sleepQuietly;

public class VisibilityExample {
    static int stop = 0;
    public static void main(String[] args) {

        VisibilityExample ve = new VisibilityExample();

        Thread t = new Thread(()->{
            while (stop<6){
                System.out.println("stop is: "+stop);
                System.out.println("I believe I can fly!");
                sleepQuietly(1000);
            }
            System.out.println("Chiled thread stopped");
        });

        Thread t2 = new Thread(()->{
           sleepQuietly(5000);
            for (int i = 0; i < 10; i++) {
                stop++;
                System.out.println("t2 changed stop to "+stop);
                sleepQuietly(1000);
            }
            System.out.println("t2 stopped");
        });

        t.start();
        t2.start();
        System.out.println("Main thread stopped");


    }
}
