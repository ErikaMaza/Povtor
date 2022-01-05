package povtor.multithreading;

import java.util.concurrent.*;

public class CallableFactorial {
    static int factorialResult;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        FactorialTwo factorial = new FactorialTwo(6);
        Future<Integer> future = executorService.submit(factorial);
        try {
            System.out.println(future.isDone());
            System.out.println("Xotim poluchit resultat: ");
            factorialResult = future.get();
            System.out.println("Poluchili resultat!");
            System.out.println(future.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        } finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }
}

class FactorialTwo implements Callable<Integer> {
    int f;
    public FactorialTwo(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("Vi vveli nevernoe chislo");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
            Thread.sleep(1000);
        }
        return result;
    }
}