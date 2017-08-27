import java.io.*;

// @author : rootTraveller, June 2017


public class TestVolatile extends Thread{
 boolean keepRunning = true;

    public void run() {
        long count=0;
        while (keepRunning) {
            System.out.println(++count);
        }

        System.out.println("Thread terminated."+count);
    }

    public static void main(String[] args) throws InterruptedException {
        TestVolatile t = new TestVolatile();
        t.start();
        Thread.sleep(1000);
        t.keepRunning = false;
        System.out.println("keepRunning set to false.");
    }
}
