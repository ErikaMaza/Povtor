package povtor.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Privet");
        al.add("Poka");
        al.add("OK");
        al.add("Uchim Java");
        al.add("A imenno lambdas");
//        Predicate<String> p = element -> element.length()<5;
//        al.removeIf(p);
         al.removeIf(element -> element.length()<5);
        System.out.println(al);
        }
    }
