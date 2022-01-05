package povtor.stream.lesson;

import java.util.*;
import java.util.stream.Collectors;

public class TaskOne {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("OK");
        list.add("poka");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));

        List<Integer> collect = list.stream().map(el -> el.length())
                .collect(Collectors.toList());

       // System.out.println(collect);

        int[] arr = {5, 9, 3, 8, 1};
       arr =  Arrays.stream(arr).map(el -> {
            if (el % 3 == 0) {
                el = el / 3;
            }
            return el;
        }).toArray();
        //System.out.println(Arrays.toString(arr));

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela?");
        set.add("OK");
        set.add("poka");
        System.out.println(set);

        Set<Integer> setTwo = set.stream().map(el -> el.length()).collect(Collectors.toSet());
        System.out.println(setTwo);
    }

}
