package povtor.multithreading;

public class VolatileTask extends Thread {
    volatile boolean b = true;

    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Loop is finished counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileTask thread = new VolatileTask();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 second it is time to wake up!");
        thread.b = false;
        thread.join();
        System.out.println("End of programm");
    }
}
