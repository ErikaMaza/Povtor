package povtor.stream.lesson;

import java.util.ArrayList;
import java.util.List;

public class Parallelstream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sumResult = list.parallelStream()
                .reduce((ac,el)->ac+el).get();
        System.out.println("sumSResult = " + sumResult);

        double divisionResult = list.stream()
                .reduce((ac,el)->ac/el).get();
        System.out.println("divisionResult = " + divisionResult);

        // parallelStream() делим количество на две части
        //(10/5)=2
        //(1/0.25)=4
        //(2/4)=0.25
    }
}
