package povtor.multithreading;


public class TaskTwelve {
    static final Object lock = new Object();

    synchronized void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ends");
        }
    }

    synchronized void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call ends");
        }
    }

    synchronized void whatappCall() {
        synchronized (lock) {
            System.out.println("WhatsApp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("WhatsApp call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWhatsApp());

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class RunnableImplMobile implements Runnable {
    public void run() {
        new TaskTwelve().mobileCall();
    }
}

class RunnableImplSkype implements Runnable {
    public void run() {
        new TaskTwelve().skypeCall();
    }
}

class RunnableImplWhatsApp implements Runnable {
    public void run() {
        new TaskTwelve().whatappCall();
    }
}
