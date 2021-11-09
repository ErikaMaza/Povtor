package povtor.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("privet", "kak dela?", "normalno", "poka");
//        for (String s: list) {
//            System.out.println(s);
//        }
        list.forEach(str -> System.out.println(str));

        List<Integer> il = new ArrayList<>();
        il.add(1);
        il.add(2);
        il.add(3);
        il.add(4);
        il.add(5);
        il.forEach(el -> {
            System.out.println(el);
            el *= 2;
            System.out.println(el);
        });
    }
}
