package povtor.multithreading;

public class TaskSeven {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Gooo!!!");
    }
}
