package povtor.multithreading;

public class TaskTwo {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt1 = new MyThread();
        mt1.start();
        mt1.join();

        MyThreadTwo mt2 = new MyThreadTwo();
        mt2.start();
        mt2.join();

    }
}
class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
class MyThreadTwo extends Thread {
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}

