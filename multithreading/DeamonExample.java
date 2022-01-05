package povtor.multithreading;

public class DeamonExample {
    public static void main(String[] args) {
        System.out.println("Main thread starts");
        USerThread uSerThread = new USerThread();
        uSerThread.setName("user_thread");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("daemon_thread");
        daemonThread.setDaemon(true);
        uSerThread.start();
        daemonThread.start();
        System.out.println("Main thread ends");
    }
}

class USerThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()
                + " is deamon: " + isDaemon());
        for (char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DaemonThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()
                + " is deamon: " + isDaemon());
        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
