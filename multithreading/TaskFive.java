package povtor.multithreading;

public class TaskFive {
    public static void main(String[] args) {
        MyThreadFive mt5 = new MyThreadFive();
        mt5.setName("my potok");
        mt5.setPriority(9);
        System.out.println("Name of mt5 = " + mt5.getName() +
                " Priority of mt5 = "  + mt5.getPriority());
    }
}
class MyThreadFive extends Thread{
    public void run(){
        System.out.println("privet");
    }
}