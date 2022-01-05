package povtor.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> freind1Action = new ArrayList<>();
        freind1Action.add(Action.NOJNICI);
        freind1Action.add(Action.BUMAGA);
        freind1Action.add(Action.NOJNICI);
        List<Action> freinds2Action = new ArrayList<>();
        freinds2Action.add(Action.BUMAGA);
        freinds2Action.add(Action.KAMEN);
        freinds2Action.add(Action.KAMEN);
        new BestFreind("Vanya", freind1Action, exchanger);
        new BestFreind("Petya", freinds2Action, exchanger);

    }
}
enum Action{
    KAMEN, NOJNICI, BUMAGA;
}
class BestFreind extends Thread{
    private String name;
    private List<Action> myAction;
    private Exchanger<Action> exchanger;

    public BestFreind(String name, List<Action> myAction, Exchanger<Action> exchanger) {
        this.name = name;
        this.myAction = myAction;
        this.exchanger = exchanger;
        this.start();
    }
    private void whoWins(Action myAction, Action freindsAction){
        if((myAction == Action.KAMEN && freindsAction == Action.NOJNICI)
        || (myAction == Action.NOJNICI && freindsAction == Action.BUMAGA)
        || (myAction == Action.BUMAGA && freindsAction == Action.KAMEN)){
            System.out.println(name + " WINS!!!");
        }
    }

    @Override
    public void run() {
        Action reply;
        for (Action action : myAction) {
            try{
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}