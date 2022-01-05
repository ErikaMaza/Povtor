package povtor.multithreading;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();

        thread.join();
        System.out.println("main ends");
    }
}

class InterruptedThread extends Thread {
    double sqrtSum = 0;

    public void run() {
        for (int i = 0; i < 1_000_000_000; i++) {
            if (isInterrupted()) {
                System.out.println("Potok hotyat prervat");
                System.out.println("Mi ubedilis, chto sostoyanie" +
                        "vsex obyektov normalnoe i reshili zavershit"
                        + "rabotu potoka");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Potok hotyat prervat vo vremya sna."
                + "Davayte zavershim ego rabotu");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}