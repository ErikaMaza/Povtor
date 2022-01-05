package povtor.collection.thread_safe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEX {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
      //  HashMap - выводит exception ConcurrentModificationException
        map.put(1, "Erika");
        map.put(2, "Yuliya");
        map.put(3, "Sergey");
        map.put(4, "Ivan");
        map.put(5, "Egor");

        Runnable runnable1 = () ->{
            Iterator<Integer> iterator = map.keySet().iterator();
            while(iterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer i = iterator.next();
                System.out.println(i + ":" + map.get(i));
            }
        };
        Runnable runnable2 = () ->{
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(6, "Elena");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map);
    }
}
