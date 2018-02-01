package lesson180130;

import codingbat.warmup1.sleepin.SleepIn;

import java.util.stream.IntStream;
import static lesson180130.ThreadUtils.sleepQuietly;
import static lesson180130.ThreadUtils.unsafePrintln;

public class RaiseConditionEx {
    private static int count;

    public static void main(String[] args) throws InterruptedException {
//        new Thread(new Walker()).start();
//        new Talker().start();
        Runnable counter = ()->{
            System.out.printf("Thread %s start%n",Thread.currentThread().getName());
            for (int i = 0; i < 1000; i++) {
                count++;
                sleepQuietly(1);
            }
        };

        Thread c1 = new Thread(counter);
        Thread c2 = new Thread(counter);

        c1.start();
        c2.start();

        c1.join();
        c2.join();

        System.out.println("total count: "+count);
    }
}

class Walker implements Runnable {
    @Override
    public void run() {
        IntStream.range(0, 10).forEach(i -> {
            unsafePrintln("runwalkrunwalk");
            sleepQuietly(10);
        });
    }
}

class Talker extends Thread{
    @Override
    public void run() {
        IntStream.range(0, 10).forEach(i -> {
            unsafePrintln("Bla-Bla-Bla");
            sleepQuietly(10);});
        }
}