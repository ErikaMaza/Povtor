package povtor.multithreading;

public class TaskThree {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThreadThree());
        thread1.start();
        Thread thread2 = new Thread(new MyThreadFour());
        thread2.start();
    }
}
class MyThreadThree implements Runnable{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
class MyThreadFour implements Runnable {
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}