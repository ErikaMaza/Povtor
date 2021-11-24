package povtor.stream.lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskFour {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((ac, el) ->
                ac * el).get();
         // System.out.println(result);
        /*
        5,8,2,4,3
        accumulator = ac = 5 40 80 320 960
        element = el = 8 2 4 3
         */

        /*List<Integer> list100 = new ArrayList<>();
       int result100 = list.stream().reduce((ac, el) ->
                ac * el).get();
        System.out.println(result100);

        Optional<Integer> o = list100.stream().reduce((ac, el) ->
                ac * el);
        if (o.isPresent()) {
            System.out.println(o.get());
        } else {
            System.out.println("Not present");
        }
        */

        int result2 = list.stream().reduce(1,(ac, el) ->
                ac * el);
        //System.out.println(result2);
        /*
        5,8,2,4,3
        accumulator = ac = 1 5 40 80 320 960
        element = el = 5 8 2 4 3
         */

        List<String> list3 = new ArrayList<>();
        list3.add("privet");
        list3.add("kak dela?");
        list3.add("OK");
        list3.add("poka");

        String result3 = list3.stream().reduce((a,e)->
        a+ " " + e).get();
        System.out.println(result3);

    }
}
